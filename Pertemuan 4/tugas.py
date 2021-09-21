# input user
print("=========== INPUT FUNCTION ============")

print("")

# data yang dimasukkan pasti string
Nama = input("masukan nama lengkap = ")
Kelas = input("masukkan kelas anda = ")
programStudi = input("masukan nama program studi = ")

# jika ingin mengambil integer, maka
beratBadan = float(input("masukan berat badan anda = "))
tinggiBadan = int(input("masukan tinggi badan anda = "))

# jika ingin mengambil boolean
biner = bool(int(input("masukan data boolean = ")))

print("Nama saya adalah ", Nama, ", type = ", type (Nama))
print("Saya berada di kelas ", Kelas, ", type = ", type (Kelas))
print("Saya berada di program studi ", programStudi, ", type = ", type (programStudi))

print("Saya memiliki berat badan  ", beratBadan, ", type = ", type (beratBadan))
print("saya memiliki tinggi badan ", tinggiBadan, ", type = ", type (tinggiBadan))

print("data ", biner, ", type = ", type (biner))

print("")

print("========== OPERATORS ===========")

print("")

#operator aritmatika
nilai1 = int(input("Masukan nilai 1 = "))
nilai2 = int(input("Masukan nilai 2 = "))

#operator
penjumlahan = nilai1 + nilai2
pengurangan = nilai1 - nilai2
perkalian = nilai1 * nilai2
pembagian = nilai1 / nilai2
pemangkatan = nilai1 ** nilai2
pembagian_bulat = nilai1 // nilai2

#output
print("===============================")
print("===== ARITMETIC OPERATORS =====")
print("===============================")
print(nilai1, "+", nilai2, "=", penjumlahan)
print(nilai1, "-", nilai2, "=", pengurangan)
print(nilai1, "*", nilai2, "=", perkalian)
print(nilai1, "/", nilai2, "=", pembagian)
print(nilai1, "**", nilai2, "=", pemangkatan)
print(nilai1, "//", nilai2, "=", pembagian_bulat)
print("===============================")

print("")

#input nilai
nilai1 = int(input("Masukan nilai 1 = "))
nilai2 = int(input("Masukan nilai 2 = "))

#operator
lebihBesar = nilai1 > nilai2
lebihKecil = nilai1 < nilai2
samaDengan = nilai1 == nilai2
tidaksamaDengan = nilai1 != nilai2
lebihbesarsamaDengan = nilai1 >= nilai2
lebihkecilsamaDengan = nilai1 <= nilai2

#output
print("================================")
print("===== COMPARISON OPERATORS =====")
print("================================")
print(nilai1, ">", nilai2, "=", lebihBesar)
print(nilai1, "<", nilai2, "=", lebihKecil)
print(nilai1, "==", nilai2, "=", samaDengan)
print(nilai1, "!=", nilai2, "=", tidaksamaDengan)
print(nilai1, ">=", nilai2, "=", lebihbesarsamaDengan)
print(nilai1, "<=", nilai2, "=", lebihkecilsamaDengan)
print("================================")

print("")

print("================================")
print("===== ASSIGNMENT OPERATORS =====")
print("================================")

# operator penugasan +=
x = 10
x += 5
print("X += 5 adalah ", x)
"""
PENJELASAN :
nilai1 += nilai2 sama saja dengan nilai1 = nilai1 + nilai2. 
BERLAKU JUGA DENGAN OPERASI YANG LAIN TINGGAL DIUBAH OPERATORNYA
"""

#operator penugasan =
x = 10
print("x adalah ", x)

#operator penugasan -=
x = 10
x -= 5
print("x -= 5 adalah ", x)

#operator penugasan *=
x = 10
x *= 5
print("x *= 5 adalah ", x)

#operator penugasan /=
x = 10
x /= 5
print("x /= 5 adalah ", x)

#operator penugasan %=
x = 10
x %= 5
print("x %= 5 adalah ", x)

#operator penugasan //=
x = 10
x //= 5
print("x //= 5 adalah ", x)

#operator penugasan **=
x = 10
x **= 5
print("x **= 5 adalah ", x)

#operator penugasan &=
x = 10
x &= 5
print("x &= 5 adalah ", x)

#operator penugasan |=
x = 10
x |= 5
print("x |= 5 adalah ", x)

#operator penugasan ^=
x = 10
x ^= 5
print("x ^= 5 adalah ", x)

#operator penugasan >>=
x = 10
x >>= 5
print("x >>= 5 adalah ", x)

#operator penugasan <<=
x = 10
x <<= 5
print("x <<= 5 adalah ", x)

print("================================")

print("")

print("=============================")
print("===== LOGICAL OPERATORS =====")
print("=============================")

#AND
print('Hasil dari T and T = ', True and True)
print('Hasil dari T and F = ', True and False)
print('Hasil dari F and T = ', False and True)
print('Hasil dari F and F = ', False and False)

print('\n')

#OR
print('Hasil dari T or T = ', True or True)
print('Hasil dari T or F = ', True or False)
print('Hasil dari F or T = ', False or True)
print('Hasil dari F or F = ', False or False)

print('\n')
#NOT
print('Hasil dari not TRUE = ', not True)
print('Hasil dari not FALSE = ', not False)

print("=============================")

print("")

print("=============================")
print("===== BITWISE OPERATORS =====")
print("=============================")

#input nilai
nilai1 = int(input("Masukan nilai 1 = "))
nilai2 = int(input("Masukan nilai 2 = "))

print("=============================")

#operator
And = nilai1 & nilai2
Or = nilai1 | nilai2
Not = ~nilai1
XOr = nilai1 ^ nilai2
RightShift = nilai1 >> nilai2
LeftShift = nilai1 << nilai2

print("nilai1 & nilai2 = ", And )
print("nilai1 | nilai2 = ", Or )
print("~nilai = ", Not )
print("nilai1 ^ nilai2 = ", XOr )
print("nilai1 >> nilai2 = ", RightShift )
print("nilai1 << nilai2 = ", LeftShift )

print("=============================")

print("")

print("==============================")
print("===== IDENTITY OPERATORS =====")
print("==============================")

#contoh 1
a = 5
b = 5
c = 6
print('a is b : ', a is b)
print('a is c : ', a is c)
print('a is not c : ', a is not c)
print('\n')

#contoh 2
i = 'Yuris alkhalifi'
j = 'Yuris alkhalifi'
print('i is j : ', i is j)
print('i is not j : ', i is not j)
print('\n')

#contoh 3
x = ['a', 'b', 'c']
y = ['a', 'b', 'c']
print('x is y : ', x is y)
print('x is not y : ', x is not y)

print("==============================")

print("")

print("================================")
print("===== MEMBERSHIP OPERATORS =====")
print("================================")

kata = 'Python'
print('kata = ', kata)
print('\'y\' in kata       : ', 'y' in kata)
print('\'k\' not in kata   : ', 'k' not in kata)
print('\'p\' not in kata   : ', 'p' not in kata)
print('\n')


bar = ['a', 'b', 'c']
print(' bar : ', bar)
print('\'a\' in bar       : ', 'a' in bar)
print('\'a\' not in bar   : ', 'a' not in bar)
print('\'d\' not in bar   : ', 'd' not in bar)
print('\n')

baz = (12, 43, 102, 55)
print('baz : ', baz)
print('102 in baz        : ', 102 in baz)
print('102not in baz     : ', 102 not in baz)
print('35 not in baz     : ', 35 not in baz)