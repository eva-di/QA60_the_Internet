package com.the_internet.test;

import com.the_internet.pages.FileUploadPage;
import com.the_internet.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUploadTest extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).selectFileUpload();
    }

    @Test
    public void uploadAFileTest() {
        new FileUploadPage(driver)
                .uploadFile("C:/Tools/cat_img.jpg")
                .clickUpload()
                .verifyFileUploaded("File Uploaded!");
    }
}
