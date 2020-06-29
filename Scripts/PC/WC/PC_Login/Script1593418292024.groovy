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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

TestData data = findTestData("TestData_1")
for (def index : (1..data.getRowNumbers() - 1)) {

//WebUI.openBrowser(AppUrl)
WebUI.openBrowser(data.internallyGetValue("URL", index))

String ObjectID = 'PolicyCenter_Login/LoginDV-username'

//WebUI.setText(findTestObject(ObjectID),     data.internallyGetValue("Uname", index))

WebUI.setText(findTestObject(data.internallyGetValue("Uname", 0)),       data.internallyGetValue("Uname", index))

WebUI.setText(findTestObject(data.internallyGetValue("Pword", 0)), data.internallyGetValue("Pword", index))

WebUI.click(findTestObject(data.internallyGetValue("LoginButton", 0)))

WebUI.closeBrowser()

}
