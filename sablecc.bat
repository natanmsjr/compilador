echo off
echo Compilando o SableCC.
echo -----------------------------------------
rmdir /Q /S .\compilador
java -jar .\sablecc.jar .\gramatica.txt
echo -----------------------------------------
echo Compilacao finalizada!
pause