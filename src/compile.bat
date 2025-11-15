@echo off
"C:\Program Files\Java\jdk-17\bin\javac" -d ../target/classes *.java
if %errorlevel% == 0 (
    echo ✅ Compilation successful!
    pause
) else (
    echo ❌ Compilation failed!
    pause
)