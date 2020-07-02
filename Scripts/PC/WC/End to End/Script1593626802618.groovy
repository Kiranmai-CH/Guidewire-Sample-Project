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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('PC/WC/End to End/pge_Login/txt_username'), GlobalVariable.UserName)

WebUI.setText(findTestObject('PC/WC/End to End/pge_Login/txt_password'), GlobalVariable.Password)

WebUI.click(findTestObject('PC/WC/End to End/pge_Login/btn_login'))

WebUI.click(findTestObject('PC/WC/End to End/pge_summary/drop_Account'))

WebUI.click(findTestObject('PC/WC/End to End/pge_summary/clk_newaccount'))

WebUI.setText(findTestObject('PC/WC/End to End/pge_accountinformation/txt_companyname'), 's')

WebUI.click(findTestObject('PC/WC/End to End/pge_accountinformation/btn_search'))

WebUI.setText(findTestObject('PC/WC/End to End/pge_accountinformation/txt_companyname'), findTestData('PC/WC/End to End/Account creation').getValue(
        1, 1))

WebUI.setText(findTestObject('PC/WC/End to End/pge_accountinformation/txt_frstname'), findTestData('PC/WC/End to End/Account creation').getValue(
        2, 1))

WebUI.setText(findTestObject('PC/WC/End to End/pge_accountinformation/txt_lastname'), findTestData('PC/WC/End to End/Account creation').getValue(
        3, 1))

WebUI.setText(findTestObject('PC/WC/End to End/pge_accountinformation/txt_city'), findTestData('PC/WC/End to End/Account creation').getValue(
        4, 1))

WebUI.selectOptionByLabel(findTestObject('PC/WC/End to End/pge_accountinformation/slct_state'), findTestData('PC/WC/End to End/Account creation').getValue(
        5, 1), false)

WebUI.setText(findTestObject('PC/WC/End to End/pge_accountinformation/txt_zipcode'), findTestData('PC/WC/End to End/Account creation').getValue(
        6, 1))

WebUI.click(findTestObject('PC/WC/End to End/pge_accountinformation/btn_createnewaccount'))

WebUI.click(findTestObject('PC/WC/End to End/pge_accountinformation/drp_newaccount_company'))

