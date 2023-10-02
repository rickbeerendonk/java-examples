@echo off

set SCRIPT_DIR=%~dp0
set FILE=%1
set FILE=%FILE:"=%
set FILE_DIR=%2
set FILE_DIR=%FILE_DIR:"=%

rem Clear terminal
cls

if "%FILE:~-4%" == ".kts" (
    rem Script
    echo script

    rem Show compiler version
    rem javac -version
    echo.

    call java "%FILE%"
)