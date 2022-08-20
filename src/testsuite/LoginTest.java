package testsuite;

import browserfactory.BaseTest;
import com.google.common.base.Verify;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String basUrl = "https://automationexercise.com/";

    @Before

    public void setBasUrl(){

        openBrowser(basUrl);
    }

    @Test
        //Login User with correct email and password
    public void  TestCase01(){

       //3. Verify that home page is visible successfully

        WebElement HomePageVisible = driver.findElement(By.xpath("//html[@lang='en']"));
        HomePageVisible.getText();


        //4. Click on 'Signup / Login' button

        WebElement ClickSignButton = driver.findElement(By.xpath("//a[@href='/login']"));
        ClickSignButton.click();


        //5. Verify 'Login to your account' is visible

        WebElement VerifyLogin = driver.findElement(By.tagName("h2"));
        VerifyLogin.getText();



        //6. Enter correct email address and password

        WebElement EnterValidEmail = driver.findElement(By.xpath("//input[@data-qa='login-email']"));
        EnterValidEmail.sendKeys("TestQA@gmail.com");
        WebElement EnterValidPassword = driver.findElement(By.xpath("//input[@data-qa='login-password']"));
        EnterValidPassword.sendKeys("Test@123.");



        //7. Click 'login' button

        WebElement CLickLogin = driver.findElement(By.xpath("//button[@data-qa='login-button']"));
        CLickLogin.click();



        //8. Verify that 'Logged in as username' is visible

        WebElement VerifyUsername = driver.findElement(By.xpath("//i[@class='fa fa-user']"));
        VerifyUsername.getText();


        //9. Click 'Delete Account' button
         WebElement ClickDeletAccount = driver.findElement(By.xpath("//a[@href='/delete_account']"));
         ClickDeletAccount.click();

        //10. Verify that 'ACCOUNT DELETED!' is visible
        WebElement VerifyAccountDlt = driver.findElement(By.xpath("//a[@href='/delete_account']"));
        VerifyAccountDlt.getText();

    }

    @Test

    public void TestCase03(){ // Login User with incorrect email and password

        //3. Verify that home page is visible successfully

        WebElement HomePageVisible = driver.findElement(By.xpath("//html[@lang='en']"));
        HomePageVisible.getText();

        //4. Click on 'Signup / Login' button

        WebElement ClickSignButton = driver.findElement(By.xpath("//a[@href='/login']"));
        ClickSignButton.click();

        //5. Verify 'Login to your account' is visible

        WebElement VerifyLogin = driver.findElement(By.tagName("h2"));
        VerifyLogin.getText();

        //6. Enter incorrect email address and password

        WebElement InValidEmail = driver.findElement(By.xpath("//input[@data-qa='login-email']"));
        InValidEmail.sendKeys("Test@gamill.com");
        WebElement InValidPassword = driver.findElement(By.xpath("//input[@data-qa='login-password']"));
        InValidPassword.sendKeys("sdsdvv4656");

        //7. Click 'login' button

        WebElement ClickLogin = driver.findElement(By.xpath("//button[@data-qa='login-button']"));
        ClickLogin.click();



        //8. Verify error 'Your email or password is incorrect!' is visible

        WebElement VerifyErrorTest = driver.findElement(By.xpath("//button[@data-qa='login-button']"));
        VerifyErrorTest.getText();

    }

    @Test

    public void TestCase04(){  // Logout User

        //3. Verify that home page is visible successfully

        WebElement HomePageVisible = driver.findElement(By.xpath("//html[@lang='en']"));
        HomePageVisible.getText();



        //4. Click on 'Signup / Login' button

        WebElement ClickSignButton = driver.findElement(By.xpath("//a[@href='/login']"));
        ClickSignButton.click();


        //5. Verify 'Login to your account' is visible

            WebElement VerifyLogin = driver.findElement(By.tagName("h2"));
            VerifyLogin.getText();



        //6. Enter correct email address and password

        WebElement EnterValidEmail = driver.findElement(By.xpath("//input[@data-qa='login-email']"));
        EnterValidEmail.sendKeys("TestQA@gmail.com");
        WebElement EnterValidPassword = driver.findElement(By.xpath("//input[@data-qa='login-password']"));
        EnterValidPassword.sendKeys("Test@123.");



        //7. Click 'login' button

        WebElement ClickLogin = driver.findElement(By.xpath("//button[@data-qa='login-button']"));
        ClickLogin.click();


        //8. Verify that 'Logged in as username' is visible


        WebElement VerifyUsername = driver.findElement(By.xpath("//i[@class='fa fa-user']"));
        VerifyUsername.getText();


        //9. Click 'Logout' button

        WebElement ClickLogout = driver.findElement(By.xpath("//a[@href='/logout']"));
        ClickLogout.click();



        //10. Verify that user is navigated to login page

        WebElement VerifyLoginButton = driver.findElement(By.xpath("//section[@id='form']"));
        VerifyLoginButton.getText();


    }

    @Test

    public void TestCase05(){  // Register User with existing email

        //3. Verify that home page is visible successfully

        WebElement HomePageVisible = driver.findElement(By.xpath("//html[@lang='en']"));
        HomePageVisible.getText();

        //4. Click on 'Signup / Login' button
        WebElement ClickSignButton = driver.findElement(By.xpath("//a[@href='/login']"));
        ClickSignButton.click();


        //5. Verify 'New User Signup!' is visible

        WebElement VerifyNewUser = driver.findElement(By.xpath("//div[@class='signup-form']"));
        VerifyNewUser.getText();

        //6. Enter name and already registered email address

        WebElement EnterName = driver.findElement(By.xpath("//input[@placeholder='Name']"));
        EnterName.sendKeys("Test");
        WebElement RegistredEmail = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
        RegistredEmail.sendKeys("TestQA@gmail.com");

        //7. Click 'Signup' button

        WebElement ClickSignup = driver.findElement(By.xpath("//button[@data-qa='signup-button']"));
        ClickSignup.click();



        //8. Verify error 'Email Address already exist!' is visible

        WebElement VerifyErrorTest = driver.findElement(By.xpath("//p[@style='color: red;']"));
        VerifyErrorTest.getText();


    }

    @Test

    public void TestCase06(){ // Verify Test Cases Page

        //3. Verify that home page is visible successfully

        WebElement HomePageVisible = driver.findElement(By.xpath("//html[@lang='en']"));
        HomePageVisible.getText();



        //4. Click on 'Test Cases' button

        WebElement ClickTestCase = driver.findElement(By.linkText("Test Cases"));
        ClickTestCase.click();

        //5. Verify user is navigated to test cases page successfully

        WebElement VerifyTestCasePage = driver.findElement(By.xpath("//section[@id='form']"));
        VerifyTestCasePage.getText();

    }

    @Test

    public  void TestCase08(){  // Verify All Products and product detail page

        //3. Verify that home page is visible successfully

        WebElement HomePageVisible = driver.findElement(By.xpath("//html[@lang='en']"));
        HomePageVisible.getText();



        //4. Click on 'Products' button

        WebElement ClickProduct = driver.findElement(By.xpath("//a[@href='/products']"));
        ClickProduct.click();

        //5. Verify user is navigated to ALL PRODUCTS page successfully

        WebElement VerifyNavigatePrdPage = driver.findElement(By.xpath("//h2[@class='title text-center']"));
        VerifyNavigatePrdPage.getText();



        //6. The products list is visible

        WebElement VisibleProductList = driver.findElement(By.xpath("//div[@class='features_items']"));
        VisibleProductList.getText();

        //7. Click on 'View Product' of first product

        WebElement ClickViewProduct = driver.findElement(By.xpath("//a[@href='/product_details/1']"));
        ClickViewProduct.click();

        //8. User is landed to product detail page

        WebElement VerifyProductDetailPg = driver.findElement(By.xpath("//div[@class='col-sm-9 padding-right']"));
        VerifyProductDetailPg.getText();

        //9. Verify that detail detail is visible: product name, category, price, availability, condition, brand

        WebElement VerifyProductName = driver.findElement(By.tagName("h2"));
         VerifyProductName.getText();
       WebElement VerifyPrdCatagory = driver.findElement(By.tagName("p"));
        VerifyPrdCatagory.getText();
       // WebElement VerifyPrdPrice = driver.findElement(By.linkText("Rs. 500"));
        //VerifyPrdPrice.getText();
        WebElement VerifyPrdAvailability = driver.findElement(By.tagName("b"));
        VerifyPrdAvailability.getText();
        WebElement VerifyPrdCondition = driver.findElement(By.tagName("b"));
        VerifyPrdCondition.getText();
        WebElement VerifyPrdBrand = driver.findElement(By.tagName("b"));
        VerifyPrdBrand.getText();


    }
    @Test
    public  void TestCase09(){  // Search Product

        //3. Verify that home page is visible successfully

        WebElement HomePageVisible = driver.findElement(By.xpath("//html[@lang='en']"));
        HomePageVisible.getText();

        //4. Click on 'Products' button
        WebElement ClickProduct = driver.findElement(By.xpath("//a[@href='/products']"));
        ClickProduct.click();


        //5. Verify user is navigated to ALL PRODUCTS page successfully

        WebElement VerifyNavigatePrdPage = driver.findElement(By.xpath("//h2[@class='title text-center']"));
        VerifyNavigatePrdPage.getText();


        //6. Enter product name in search input and click search button

        WebElement EnterProductSearch = driver.findElement(By.xpath("//input[@id='search_product']"));
        EnterProductSearch.sendKeys("Blue Top");
        WebElement ClickSearch = driver.findElement(By.xpath("//button[@id='submit_search']"));
        ClickSearch.click();

        //7. Verify 'SEARCHED PRODUCTS' is visible

        WebElement VerifySearchProduct = driver.findElement(By.xpath("//h2[@class='title text-center']"));
        VerifySearchProduct.getText();

        //8. Verify all the products related to search are visible

        WebElement VerifySearchallProduct = driver.findElement(By.xpath("//div[@class='product-image-wrapper']"));
        VerifySearchallProduct.getText();

    }

    @After

    public void termDown(){

   //closeBrowser();
    }

}
