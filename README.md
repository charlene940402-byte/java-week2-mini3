# java-week2-mini3

Q1： int result = 7 + 3 + 1 ; 。

A.

int result = 7 + 3 + 1 ;

MOVI R1, 7

MOVI R2, 3

ADD R0, R1, R2

MOVI R2, 1

ADD R0, R0, R2

STORE \[0], R0



Q2：自行選三個 0 至 99 的整數，將輸入和實際輸出記在 README。

A.

int result = 54 + 6 + 37 ;

MOVI R1, 54

MOVI R2, 3

ADD R0, R1, R2

MOVI R2, 37

ADD R0, R0, R2

STORE \[0], R0



README 回答：第一次 ADD 之後，為什麼能用第三個整數覆蓋 R2 ？

A.

第一次(ADD R0, R1, R2)執行後，前兩個數的和已經存在 R0 中，R2 原本的值（第二個整數）之後不會再被任何指令使用。因此可以用(MOVI R2, 第三個整數)覆蓋 R2，再以(ADD R0, R0, R2)把第三個數加到累計結果上。這樣重複使用暫存器，就不需要額外的 R3。



README 回答：若輸入改成 int result=7+3+1; ，目前程式為什麼無法按預期讀取？

A.

Scanner 預設以空白分隔 token，所以程式假設每個符號之間都有空白，並依固定順序讀取。

輸入 int result=7+3+1;

Scanner 只切得出兩段：int 和 result=7+3+1;。

第一個next()讀到int，第二個next()讀到result=7+3+1，第三個next()就沒東西讀了，程式就會卡住

