import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('GoBrowser/URL'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('URL'), 'http://www.haberturk.com/')

WebUI.click(findTestObject('buttonAnalyze'))

WebUI.waitForPageLoad(0)

WebUI.waitForElementVisible(findTestObject('NeedsWorkResult'), 0)

WebUI.getText(findTestObject('NeedsWorkResult'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('C:\\Users\\nbalitatli\\Desktop\\PageSpeedScreenShot\\mobile.png')

WebUI.click(findTestObject('buttonDesktop'))

WebUI.waitForElementVisible(findTestObject('DesktopNeedsWorkResult'), 0)

WebUI.getText(findTestObject('DesktopNeedsWorkResult'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('C:\\Users\\nbalitatli\\Desktop\\PageSpeedScreenShot\\desktop.png')

WebUI.closeBrowser()

