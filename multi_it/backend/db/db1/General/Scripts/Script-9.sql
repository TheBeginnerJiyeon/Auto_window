-- CONNECTION: url=jdbc:oracle:thin:@//localhost:1521/XE


-- New script in SYSTEM.
-- Connection Type: dev 
-- Url: jdbc:oracle:thin:@//localhost:1521/XE
-- workspace : C:\Users\dkswl\OneDrive\Documents\code_upload\Auto_window\multi_it\backend\db\db1
-- Date: 2024. 5. 13.
-- Time: 오후 6:38:51


ALTER USER hr IDENTIFIED BY hr ACCOUNT UNLOCK;

GRANT CONNECT, RESOURCE, DBA TO HR;