@echo off
set IMQ_HOME="C:\glassfish-3.1.2.2\mq"

%IMQ_HOME%\bin\imqobjmgr add -t tf -l "java:tf"  -j java.naming.provider.url=file:///C:/temp -j java.naming.factory.initial=com.sun.jndi.fscontext.RefFSContextFactory -f

%IMQ_HOME%\bin\imqobjmgr add -t t -l "svm/subTeam" -o "imqDestinationName=svmsubTeam" -j java.naming.provider.url=file:///C:/temp -j java.naming.factory.initial=com.sun.jndi.fscontext.RefFSContextFactory -f
%IMQ_HOME%\bin\imqobjmgr add -t t -l "svm/member" -o "imqDestinationName=svmmember" -j java.naming.provider.url=file:///C:/temp -j java.naming.factory.initial=com.sun.jndi.fscontext.RefFSContextFactory -f

pause