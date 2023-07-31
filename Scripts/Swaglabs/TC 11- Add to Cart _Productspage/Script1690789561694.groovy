import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startExistingApplication('com.swaglabsmobileapp')

Mobile.setText(findTestObject('Swaglabs/1- Settext_Username'), 'problem_user', 0)

Mobile.setText(findTestObject('Swaglabs/2- Settext_Password'), 'secret_sauce', 0)

Mobile.tap(findTestObject('Swaglabs/3- Click_Login'), 0)

Mobile.tap(findTestObject('Object Repository/Swaglabs/11- Add to Cart_Productspage'), 0)

Mobile.tap(findTestObject('Object Repository/Swaglabs/11- Add to Cart1_Productspage'), 0)

Mobile.scrollToText('Test.allTheThings() T-Shirt (Red)')

Mobile.tap(findTestObject('Object Repository/Swaglabs/11- Add to Cart2_Productspage'), 0)

Mobile.tap(findTestObject('Object Repository/Swaglabs/11- Add to Cart3_Productspage'), 0)

Mobile.tap(findTestObject('Object Repository/Swaglabs/11- Add to Cart4_Productspage'), 0)

Mobile.tap(findTestObject('Object Repository/Swaglabs/11- Add to Cart5_Productspage'), 0)

Mobile.scrollToText('Sauce Labs Backpack')

Mobile.verifyElementVisible(findTestObject('Object Repository/Swaglabs/11- Productspage_Assertion'), 0)

Mobile.closeApplication()

