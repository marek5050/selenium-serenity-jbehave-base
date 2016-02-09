@echo off

echo strFileURL="http://mywebsite.com/file.txt" > C:\dl.vbs
echo strHDLocation = "C:\file.csv" >> C:\dl.vbs
echo Set objXMLHTTP = CreateObject("MSXML2.XMLHTTP") >> C:\dl.vbs
echo objXMLHTTP.open "GET", strFileURL, false >> C:\dl.vbs
echo objXMLHTTP.send() >> C:\dl.vbs
echo If objXMLHTTP.Status = 200 Then >> C:\dl.vbs
echo Set objADOStream = CreateObject("ADODB.Stream") >> C:\dl.vbs
echo objADOStream.Open >> C:\dl.vbs
echo objADOStream.Type = 1 'adTypeBinary >> C:\dl.vbs
echo objADOStream.Write objXMLHTTP.ResponseBody >> C:\dl.vbs
echo objADOStream.Position = 0 'Set the stream position to the start >> C:\dl.vbs
echo Set objFSO = Createobject("Scripting.FileSystemObject") >> C:\dl.vbs
echo If objFSO.Fileexists(strHDLocation) Then objFSO.DeleteFile strHDLocation >> C:\dl.vbs
echo Set objFSO = Nothing >> C:\dl.vbs
echo objADOStream.SaveToFile strHDLocation >> C:\dl.vbs
echo objADOStream.Close >> C:\dl.vbs
echo Set objADOStream = Nothing >> C:\dl.vbs
echo End if >> C:\dl.vbs
echo Set objXMLHTTP = Nothing >> C:\dl.vbs

