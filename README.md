# aft2022t
Alkalmazásfejlesztés technológia 2022 tavasz

//install c feladat
https://www.youtube.com/watch?v=2QNGdKdWSyM&ab_channel=AVSKDevelopers

//feladat
Harmadik labor
Az "fd11*ova" (>=20220204, felhasználó/jelszó: jani/q) virtuális gép használható. Laboron saját gép is
használható, tetszőleges környezettel, de vizsgán csak az fd11*ova, ezért célszerű megismerkedni vele!
 1. Mind egy csoportban dolgoztok, egy github repóban! Kövessétek a KanBan-t!
 A) Csak NetBeans 12-t lehet használni.
 B) A laborvezető által adott github repóba kommitoljatok!
 C) Jó kódolást!
 2. Implementáljatok kockadobó-programot! Dob valahány darab valahány oldalú "kockával"! Például ha 4
darab 6 oldalú kockával (röviden: 4d6) gurítunk, akkor négy darab 1 és 6 közé eső "véletlen" számot
generál. Jó lenne a korábbi dobásokat (de legalább az előzőt) látni.
XXX A) Csináljatok egyszerű GUI-t két JSpinner-rel és egy "Dobj!" gombbal!
 B) Adjatok hozzá egy "N darabot egymás után!" opciót!
 C) Készítsetek telepítőt, ami a felhasználó által megadott könyvtárba másolja a jar fájlt!
 D) Készítsetek hozzá egy szép GUI! Jelenjenek meg képek, amikor a GUI-t piszkálom! (@see google
image search "d8 d20")
XXX E) Legyen hangja is!
XXX F) Adjatok hozzá egy "about" gombot, amiben van programnév, verzió, készítők listája!
 G) Adjatok hozzá egy JProgressBar-t, ami a dobás 1 másodperces "folyamatát" mutatja!
XXX H) A dobások tartsanak 10...30 decimásodpercig, véletlen-szerűen sorsolva! KÉSZ
 I) Mentsétek el a program állapotát kilépéskor! Induláskor töltsétek vissza!
X J) Adjatok Javadoc-ot a kódhoz! Generáljátok le a HTML-t!
 K) Adjatok "build number"-t az "about"-hoz! Oldjátok meg, hogy újraépítéskor nőjön a szám!
 L) Csináljatok élő bemutatót (live demo) a Robot osztállyal, a /livedemo kapcsolóval indítva fusson!
 M) Adjatok hozzá egy JTabbedPane-t, rakjátok át az "about"-ot a második fülre!
X N) Adjatok hozzá egy JTable-t egy JScrollPane-ben, ami a korábbi dobásokat mutatja, időbélyeggel!
 O) Adjatok hozzá egy "feltöltés" gombot, ami MariaDB-be (MySQL) menti a dobásokat!
 P) Adjatok hozzá egy "letöltés" gombot, ami MariaDB-ből (MySQL) visszaállítja a dobásokat!
 Q) Adjatok hozzá egy "képernyőkép" gombot, ami csinál egy képernyőképet!
 R) Kilépéskor mentse JSON fájlba az állapotát a program, induláskor töltse vissza!
 S) Készítsetek gyönyörű GUI-t, animációkkal!
 T) Készítsetek egy "Mentés" gombot, ami CSV-be menti a dobásokat!
 U) Készítsetek egy "Betöltés" gombot, ami CSV-ből importálja a dobásokat!
 V) Készítsetek egy "Export" gombot, ami naplófájlba menti a dobásokat, időbélyeggel!
 W) Adjatok hozzá egy gombot, ami elküldi e-mailbe az aktuális képernyőképet!
 3. Szorgalmi HF: nézzétek át a végső kódot, hogy mások munkáját is lássátok