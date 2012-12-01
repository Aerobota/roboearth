(cl:defpackage re_srvs-srv
  (:use )
  (:export
   "VISUALLOCATION"
   "<VISUALLOCATION-REQUEST>"
   "VISUALLOCATION-REQUEST"
   "<VISUALLOCATION-RESPONSE>"
   "VISUALLOCATION-RESPONSE"
   "REQUEST2DMAP"
   "<REQUEST2DMAP-REQUEST>"
   "REQUEST2DMAP-REQUEST"
   "<REQUEST2DMAP-RESPONSE>"
   "REQUEST2DMAP-RESPONSE"
   "SETACTIONRECIPE"
   "<SETACTIONRECIPE-REQUEST>"
   "SETACTIONRECIPE-REQUEST"
   "<SETACTIONRECIPE-RESPONSE>"
   "SETACTIONRECIPE-RESPONSE"
   "ADDWORLDMODELOBJECT"
   "<ADDWORLDMODELOBJECT-REQUEST>"
   "ADDWORLDMODELOBJECT-REQUEST"
   "<ADDWORLDMODELOBJECT-RESPONSE>"
   "ADDWORLDMODELOBJECT-RESPONSE"
   "GETOBJECT"
   "<GETOBJECT-REQUEST>"
   "GETOBJECT-REQUEST"
   "<GETOBJECT-RESPONSE>"
   "GETOBJECT-RESPONSE"
   "DETECTOBJECTS"
   "<DETECTOBJECTS-REQUEST>"
   "DETECTOBJECTS-REQUEST"
   "<DETECTOBJECTS-RESPONSE>"
   "DETECTOBJECTS-RESPONSE"
   "SEARCHENVIRONMENTS"
   "<SEARCHENVIRONMENTS-REQUEST>"
   "SEARCHENVIRONMENTS-REQUEST"
   "<SEARCHENVIRONMENTS-RESPONSE>"
   "SEARCHENVIRONMENTS-RESPONSE"
   "UPDATEACTIONRECIPE"
   "<UPDATEACTIONRECIPE-REQUEST>"
   "UPDATEACTIONRECIPE-REQUEST"
   "<UPDATEACTIONRECIPE-RESPONSE>"
   "UPDATEACTIONRECIPE-RESPONSE"
   "DELACTIONRECIPE"
   "<DELACTIONRECIPE-REQUEST>"
   "DELACTIONRECIPE-REQUEST"
   "<DELACTIONRECIPE-RESPONSE>"
   "DELACTIONRECIPE-RESPONSE"
   "LOADVSLAMMAP"
   "<LOADVSLAMMAP-REQUEST>"
   "LOADVSLAMMAP-REQUEST"
   "<LOADVSLAMMAP-RESPONSE>"
   "LOADVSLAMMAP-RESPONSE"
   "QUERYACTIONRECIPES"
   "<QUERYACTIONRECIPES-REQUEST>"
   "QUERYACTIONRECIPES-REQUEST"
   "<QUERYACTIONRECIPES-RESPONSE>"
   "QUERYACTIONRECIPES-RESPONSE"
   "QUERYOBJECTS"
   "<QUERYOBJECTS-REQUEST>"
   "QUERYOBJECTS-REQUEST"
   "<QUERYOBJECTS-RESPONSE>"
   "QUERYOBJECTS-RESPONSE"
   "SETENVIRONMENTBINARYFILE"
   "<SETENVIRONMENTBINARYFILE-REQUEST>"
   "SETENVIRONMENTBINARYFILE-REQUEST"
   "<SETENVIRONMENTBINARYFILE-RESPONSE>"
   "SETENVIRONMENTBINARYFILE-RESPONSE"
   "DELOBJECTBINARYFILE"
   "<DELOBJECTBINARYFILE-REQUEST>"
   "DELOBJECTBINARYFILE-REQUEST"
   "<DELOBJECTBINARYFILE-RESPONSE>"
   "DELOBJECTBINARYFILE-RESPONSE"
   "GETACTIONRECIPE"
   "<GETACTIONRECIPE-REQUEST>"
   "GETACTIONRECIPE-REQUEST"
   "<GETACTIONRECIPE-RESPONSE>"
   "GETACTIONRECIPE-RESPONSE"
   "GETNEXTPOSE"
   "<GETNEXTPOSE-REQUEST>"
   "GETNEXTPOSE-REQUEST"
   "<GETNEXTPOSE-RESPONSE>"
   "GETNEXTPOSE-RESPONSE"
   "ROBOEARTHRETRIEVECOPMODEL"
   "<ROBOEARTHRETRIEVECOPMODEL-REQUEST>"
   "ROBOEARTHRETRIEVECOPMODEL-REQUEST"
   "<ROBOEARTHRETRIEVECOPMODEL-RESPONSE>"
   "ROBOEARTHRETRIEVECOPMODEL-RESPONSE"
   "GETENVIRONMENTBINARYFILE"
   "<GETENVIRONMENTBINARYFILE-REQUEST>"
   "GETENVIRONMENTBINARYFILE-REQUEST"
   "<GETENVIRONMENTBINARYFILE-RESPONSE>"
   "GETENVIRONMENTBINARYFILE-RESPONSE"
   "SETENVIRONMENT"
   "<SETENVIRONMENT-REQUEST>"
   "SETENVIRONMENT-REQUEST"
   "<SETENVIRONMENT-RESPONSE>"
   "SETENVIRONMENT-RESPONSE"
   "UPDATEOBJECT"
   "<UPDATEOBJECT-REQUEST>"
   "UPDATEOBJECT-REQUEST"
   "<UPDATEOBJECT-RESPONSE>"
   "UPDATEOBJECT-RESPONSE"
   "UPDATEOBJECTBINARYFILE"
   "<UPDATEOBJECTBINARYFILE-REQUEST>"
   "UPDATEOBJECTBINARYFILE-REQUEST"
   "<UPDATEOBJECTBINARYFILE-RESPONSE>"
   "UPDATEOBJECTBINARYFILE-RESPONSE"
   "SEARCHACTIONRECIPES"
   "<SEARCHACTIONRECIPES-REQUEST>"
   "SEARCHACTIONRECIPES-REQUEST"
   "<SEARCHACTIONRECIPES-RESPONSE>"
   "SEARCHACTIONRECIPES-RESPONSE"
   "ROBOEARTHEXPORTCOPMODEL"
   "<ROBOEARTHEXPORTCOPMODEL-REQUEST>"
   "ROBOEARTHEXPORTCOPMODEL-REQUEST"
   "<ROBOEARTHEXPORTCOPMODEL-RESPONSE>"
   "ROBOEARTHEXPORTCOPMODEL-RESPONSE"
   "DELENVIRONMENT"
   "<DELENVIRONMENT-REQUEST>"
   "DELENVIRONMENT-REQUEST"
   "<DELENVIRONMENT-RESPONSE>"
   "DELENVIRONMENT-RESPONSE"
   "SEARCHOBJECTS"
   "<SEARCHOBJECTS-REQUEST>"
   "SEARCHOBJECTS-REQUEST"
   "<SEARCHOBJECTS-RESPONSE>"
   "SEARCHOBJECTS-RESPONSE"
   "QUERYENVIRONMENTS"
   "<QUERYENVIRONMENTS-REQUEST>"
   "QUERYENVIRONMENTS-REQUEST"
   "<QUERYENVIRONMENTS-RESPONSE>"
   "QUERYENVIRONMENTS-RESPONSE"
   "GETENVIRONMENT"
   "<GETENVIRONMENT-REQUEST>"
   "GETENVIRONMENT-REQUEST"
   "<GETENVIRONMENT-RESPONSE>"
   "GETENVIRONMENT-RESPONSE"
   "SETOBJECTBINARYFILE"
   "<SETOBJECTBINARYFILE-REQUEST>"
   "SETOBJECTBINARYFILE-REQUEST"
   "<SETOBJECTBINARYFILE-RESPONSE>"
   "SETOBJECTBINARYFILE-RESPONSE"
   "GETOBJECTBINARYFILE"
   "<GETOBJECTBINARYFILE-REQUEST>"
   "GETOBJECTBINARYFILE-REQUEST"
   "<GETOBJECTBINARYFILE-RESPONSE>"
   "GETOBJECTBINARYFILE-RESPONSE"
   "DELOBJECT"
   "<DELOBJECT-REQUEST>"
   "DELOBJECT-REQUEST"
   "<DELOBJECT-RESPONSE>"
   "DELOBJECT-RESPONSE"
   "REQUESTPROJ2DMAP"
   "<REQUESTPROJ2DMAP-REQUEST>"
   "REQUESTPROJ2DMAP-REQUEST"
   "<REQUESTPROJ2DMAP-RESPONSE>"
   "REQUESTPROJ2DMAP-RESPONSE"
   "SETOBJECT"
   "<SETOBJECT-REQUEST>"
   "SETOBJECT-REQUEST"
   "<SETOBJECT-RESPONSE>"
   "SETOBJECT-RESPONSE"
   "DELENVIRONMENTBINARYFILE"
   "<DELENVIRONMENTBINARYFILE-REQUEST>"
   "DELENVIRONMENTBINARYFILE-REQUEST"
   "<DELENVIRONMENTBINARYFILE-RESPONSE>"
   "DELENVIRONMENTBINARYFILE-RESPONSE"
   "UPDATEENVIRONMENTBINARYFILE"
   "<UPDATEENVIRONMENTBINARYFILE-REQUEST>"
   "UPDATEENVIRONMENTBINARYFILE-REQUEST"
   "<UPDATEENVIRONMENTBINARYFILE-RESPONSE>"
   "UPDATEENVIRONMENTBINARYFILE-RESPONSE"
   "UPDATEENVIRONMENT"
   "<UPDATEENVIRONMENT-REQUEST>"
   "UPDATEENVIRONMENT-REQUEST"
   "<UPDATEENVIRONMENT-RESPONSE>"
   "UPDATEENVIRONMENT-RESPONSE"
  ))
