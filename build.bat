@echo off
setlocal

REM Check for OS type
set "OS=%OS%"

REM Run Maven build
call mvn install

REM Store the exit code of the previous command
set "BUILD_SUCCESS=1"

if "%OS%"=="Windows_NT" (
    REM Enable ANSI escape codes in Windows Terminal
    reg add "HKCU\Console" /v VirtualTerminalLevel /t REG_DWORD /d 1 /f >nul 2>&1
    echo [1m[33m---------WAIT!!  UNIQUE ID VALIDATION IS IN-PROGRESS---------[0m
) else (
    REM Print wait message for UNIX-like systems
    echo -e "\033[1m\033[33m---------WAIT!!  UNIQUE ID VALIDATION IS IN-PROGRESS---------\033[0m"
)

mvn compile exec:java -Dexec.mainClass="com.simplifyqa.codeeditor.helper.DuplicateIdChecker"
set "EXIT_CODE=%ERRORLEVEL%"

if %EXIT_CODE% NEQ 0 (
    if "%OS%"=="Windows_NT" (
        echo [1m[31m---------------BUILD FAILED---------------[0m
        echo [1m[31m--------Sync will fail until unique Ids are corrected--------[0m
    ) else (
        echo -e "\033[1m\033[31m---------------BUILD FAILED---------------\033[0m"
        echo -e "\033[1m\033[31m--------Sync will fail until unique Ids are corrected--------\033[0m"
    )
)

endlocal
