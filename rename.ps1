cd src\main\java\com\github\GTNH2Mega\fromScripts
Get-Item * | ForEach-Object {
  Rename-Item $_ ($_.Name -replace "-", "")
}