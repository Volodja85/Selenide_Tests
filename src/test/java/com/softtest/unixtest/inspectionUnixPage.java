package com.softtest.unixtest;


import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.softtest.unix.HomePage;
import org.testng.reporters.Files;
import utils.TestRunner;
import java.io.*;


public class inspectionUnixPage extends TestRunner {

    private String parseJson(String jsonName) throws FileNotFoundException {
        InputStream is = new FileInputStream(jsonName);
        String json = null;
        try {
            json = Files.readFile(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String textJson[] = json.split(":");

        return textJson[1].replaceAll("}", "").replaceAll("\"", "").trim();
    }

//

    @Test(description = "LVTEST-1")
    @Description("Verify that the title of the header matches its name")

    public void verifyHeader() throws IOException {

        String name = new HomePage()
                .open()
                .category()
                .DevOpsButton()
                .UNIXButton()
                .titleUnixPage();

        Assert.assertEquals(name, parseJson("src/test/resources/json_title.json"));
    }

    @Test(description = "LVTEST-2")
    @Description("Verify that the title of the header matches its nameError")
    public void verifyHeaderError() {

        String name = new HomePage()
                .category()
                .DevOpsButton()
                .UNIXButton()
                .titleUnixPage();

        Assert.assertEquals(name, "Linux/Unix Tutoriall");
    }
}
