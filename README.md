(**2**) deadlock bu threadlar bir vaqtda ishloyatgam paytda dasturning toxtab qoladi oshanda deadlock sodir boladi. biz buni misol orqali korishimiz mumkin
yumaloq stol atrofida 5 ta odam otiribdi ularning har birini oldida bittadan spagetti va vilka boladi. bu odamlar har biri ushbu spagettini 2 ta vilkada yiyishi shart boladi va bu yerda har biri qoliga bita vilkani oladi. shunda hatolik sodir boladi shunki spagettini ikkta vilkada yiyish kerak va ularning har biri yana vilkani qoyadi. lekn hali ham osha ahvol boladi.
bu yerda deadlock sodir bolgan boladi.
Uni qanday bartaraf etishi mumkin?
deadlock ni bartaraf etish uchun sinxronlash kerak yani(synchronized) VA YANA BU YERDA wait() ORQALI uxlatib qoyish kerak va notify() orqali toxtash kerak.

(**5**)\b\d{1,2}-\d{1,2}-\d{4}\b
sanani aniqlash uchun regax kodi(12-31-2000) yil bu yerda 1000 dan boshlanadi

regax boyicha
\d raqamlarni aniqlaydi

\w 3 ta narsani harflar sonlar va_ ni aniqlaydi


\D bu raqamlarni olmaydi


\W bu 3 ta narsani olmaydi raqam harf, _

\x{n,m} bu yerda x ga \d , \w, \s yoki boshqa narsalarni qoysa boladi. n bu yerda boshlanish, m oxiri hisoblanadi yaninecha martaligini kiritamiz

\s bu slash larni aniqlaydi 

|+| bu 1 to yoki kop degani 

|*| 0 ta yoki kop degani

|?| 0 ta yoki 1 ta degani

()  bu guruhlash hisoblanadi

(?=.*\d) bu kiritgan raqamgacha bolgan hamma narsani oladi
| yoki degani xisoblanadi