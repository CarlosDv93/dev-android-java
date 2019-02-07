@echo off
cls

echo ================== AVISO ======================
echo      confirmar local da instalação do Nox
echo         C:\Program Files (x86)\Nox\bin
echo ================== AVISO ======================

cd C:\Program Files (x86)\Nox\bin

echo Entrou na pasta C:\Program Files (x86)\Nox\bin
echo Executando o comando ..........

nox_adb.exe connect 127.0.0.1:62001

echo Conectou com sucesso

pause

