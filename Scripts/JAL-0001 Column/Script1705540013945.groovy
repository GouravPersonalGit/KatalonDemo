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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://elb-d-ecoponlb52s-e23d660f2632086e.elb.ap-northeast-1.amazonaws.com:4502/libs/granite/core/content/login.html?resource=%2F&$$login$$=%24%24login%24%24&j_reason=unknown&j_reason_code=unknown')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('LoginPage/UserName'), 'Z0015195')

WebUI.setEncryptedText(findTestObject('LoginPage/Password'), '0HUOG8cQQkM2lSw/11RpCA==')

WebUI.click(findTestObject('LoginPage/LoginButton'))

WebUI.waitForElementPresent(findTestObject('Navigation/Sites_Link'), 30)

//WebUI.navigateToUrl('http://elb-d-ecoponlb52s-e23d660f2632086e.elb.ap-northeast-1.amazonaws.com:4502/editor.html/content/www/wwwjalcojp/ar/ja/author-test/adobe/test2.html')
WebUI.click(findTestObject('Navigation/Sites_Link'))

WebUI.click(findTestObject('Navigation/www_Link'))

WebUI.click(findTestObject('Navigation/wwwjalcojp_Link'))

WebUI.click(findTestObject('Navigation/ar_Link'))

WebUI.click(findTestObject('Navigation/ja_Link'))

WebUI.click(findTestObject('Navigation/author-test_Link'))

WebUI.click(findTestObject('Navigation/adobe_Link'))

WebUI.click(findTestObject('Navigation/CreatePageButton'))

WebUI.click(findTestObject('Navigation/Page_Option'))

WebUI.click(findTestObject('Navigation/simpleHeaderTemplate'))

WebUI.click(findTestObject('Navigation/NextButton'))

WebUI.setText(findTestObject('Navigation/NewPageTitleField'), 'Test2')

WebUI.click(findTestObject('Navigation/FinalCreatePage'))

WebUI.waitForElementVisible(findTestObject('Navigation/pageCreatedSuccessMessage'), 30)

WebUI.click(findTestObject('Navigation/OpenCreatedPage'))

WebUI.switchToWindowIndex(1)

WebUI.waitForElementPresent(findTestObject('JAL-0001/Drag components here'), 30)

// For 1 testcase (PC/SP 1 column )
WebUI.click(findTestObject('JAL-0001/Drag components here'))

WebUI.click(findTestObject('JAL-0001/Add Component Icon'))

WebUI.setText(findTestObject('JAL-0001/InsertComponentSearch'), 'JAL-0001 column')

WebUI.click(findTestObject('JAL-0001/JAL-0001 column'))

WebUI.waitForElementPresent(findTestObject('JAL-0001/CreatedJAL-0001Comp'), 30)

WebUI.click(findTestObject('JAL-0001/CreatedJAL-0001Comp'))

WebUI.click(findTestObject('JAL-0001/AddSubComp'))

WebUI.setText(findTestObject('JAL-0001/InsertComponentSearch'), 'JAL-0028 text')

WebUI.waitForElementVisible(findTestObject('JAL-0001/JAL-0028 text'), 30)

WebUI.click(findTestObject('JAL-0001/JAL-0028 text'))

WebUI.waitForElementVisible(findTestObject('JAL-0001/CreatedJAL-0028Comp'), 30)

WebUI.click(findTestObject('JAL-0001/CreatedJAL-0028Comp'))

WebUI.waitForElementClickable(findTestObject('JAL-0001/ConfigSubComp'), 30)

WebUI.click(findTestObject('JAL-0001/ConfigSubComp'))

WebUI.click(findTestObject('JAL-0001/inputText0028'))

WebUI.click(findTestObject('JAL-0001/SizeIcon'))

WebUI.click(findTestObject('JAL-0001/Size20px'))

WebUI.setText(findTestObject('JAL-0001/inputText0028'), 'Left-aligned, extra small')

WebUI.click(findTestObject('JAL-0001/CheckJalCmp'))

// For 2 testcase (PC/SP 2 column )
WebUI.waitForElementVisible(findTestObject('JAL-0001/Drag components here'), 30)

WebUI.click(findTestObject('JAL-0001/Drag components here'))

WebUI.click(findTestObject('JAL-0001/Add Component Icon'))

WebUI.setText(findTestObject('JAL-0001/InsertComponentSearch'), 'JAL-0001 column')

WebUI.click(findTestObject('JAL-0001/JAL-0001 column'))

WebUI.waitForElementPresent(findTestObject('JAL-0001/CreatedJAL-0001Comp'), 30)

WebUI.click(findTestObject('JAL-0001/CreatedJAL-0001Comp'))

WebUI.waitForElementClickable(findTestObject('JAL-0001/ConfigSubComp'), 30)

WebUI.click(findTestObject('JAL-0001/ConfigSubComp'))

WebUI.waitForElementClickable(findTestObject('JAL-0001/columnTypeDropdown'), 30)

WebUI.click(findTestObject('JAL-0001/columnTypeDropdown'))

WebUI.click(findTestObject('JAL-0001/PC-SP 2 columns-option'))

WebUI.click(findTestObject('JAL-0001/CheckJalCmp'))

WebUI.waitForElementPresent(findTestObject('JAL-0001/TC2_DragCmp1'), 30)

WebUI.click(findTestObject('JAL-0001/TC2_DragCmp1'))

WebUI.click(findTestObject('JAL-0001/Add Component Icon'))

WebUI.setText(findTestObject('JAL-0001/InsertComponentSearch'), 'JAL-0028 text')

WebUI.waitForElementVisible(findTestObject('JAL-0001/JAL-0028 text'), 30)

WebUI.click(findTestObject('JAL-0001/JAL-0028 text'))

WebUI.waitForElementVisible(findTestObject('JAL-0001/CreatedJAL-0028Comp'), 30)

WebUI.click(findTestObject('JAL-0001/CreatedJAL-0028Comp'))

WebUI.waitForElementClickable(findTestObject('JAL-0001/ConfigSubComp'), 30)

WebUI.click(findTestObject('JAL-0001/ConfigSubComp'))

WebUI.click(findTestObject('JAL-0001/inputText0028'))

WebUI.click(findTestObject('JAL-0001/SizeIcon'))

WebUI.click(findTestObject('JAL-0001/Size150px'))

WebUI.setText(findTestObject('JAL-0001/inputText0028'), 'Medium, Small')

WebUI.click(findTestObject('JAL-0001/CheckJalCmp'))

WebUI.waitForElementPresent(findTestObject('JAL-0001/TC2-DragCmp2'), 30)

WebUI.click(findTestObject('JAL-0001/TC2-DragCmp2'))

WebUI.click(findTestObject('JAL-0001/Add Component Icon'))

WebUI.setText(findTestObject('JAL-0001/InsertComponentSearch'), 'JAL-0028 text')

WebUI.waitForElementVisible(findTestObject('JAL-0001/JAL-0028 text'), 30)

WebUI.click(findTestObject('JAL-0001/JAL-0028 text'))

WebUI.waitForElementVisible(findTestObject('JAL-0001/CreatedJAL-0028Comp'), 30)

WebUI.click(findTestObject('JAL-0001/CreatedJAL-0028Comp'))

WebUI.waitForElementClickable(findTestObject('JAL-0001/ConfigSubComp'), 30)

WebUI.click(findTestObject('JAL-0001/ConfigSubComp'))

WebUI.click(findTestObject('JAL-0001/inputText0028'))

WebUI.click(findTestObject('JAL-0001/SizeIcon'))

WebUI.click(findTestObject('JAL-0001/Size150px'))

WebUI.setText(findTestObject('JAL-0001/inputText0028'), 'Medium, Small')

WebUI.click(findTestObject('JAL-0001/CheckJalCmp'))

WebUI.click(findTestObject('JAL-0001/propertiesIcon'))

WebUI.click(findTestObject('JAL-0001/viewAsPublished'))

WebUI.switchToWindowIndex(2)

WebUI.waitForElementVisible(findTestObject('JAL-0001/TC1_Content'), 30)

WebUI.waitForElementVisible(findTestObject('JAL-0001/TC2_Content1'), 10)

WebUI.waitForElementVisible(findTestObject('JAL-0001/TC2_Content2'), 10)

WebUI.closeWindowIndex(2)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.waitForElementPresent(findTestObject('Navigation/JAL-0001Page'), 30)

WebUI.click(findTestObject('Navigation/JAL-0001Page'))

WebUI.click(findTestObject('Navigation/moreIcon'))

WebUI.click(findTestObject('Navigation/deletePage'))

WebUI.waitForElementPresent(findTestObject('Navigation/deleteConfirmation'), 0)

WebUI.click(findTestObject('Navigation/finalDeleteButton'))

WebUI.closeBrowser()

