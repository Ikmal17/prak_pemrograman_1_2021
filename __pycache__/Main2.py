#VARIABEL PYTHON
#contoh semuanya
namaSaya = "Ikmal Dwi Darmawan"
umur = 18
tinggiBadan = 178

# pemanggilan pertama
print("Nama saya adalah ", namaSaya)
print("Umur saya adalah ", str(umur) + "tahun")
print("Tinggi badan saya adalah ", tinggiBadan)

print("saya akan mencoba untuk")
print("belajar variabel python dasar")
print("bismillahirrohmanirrohim")

# tipe data : angka satuan yang gaada komanya(integer)
data_integer = 1
print("data : ", data_integer)
print("bertipe : ", type(data_integer))

#tipe data : angka yang ada komanya (float)
data_float = 1.5
print("data : ", data_float)
print("bertipe : ", type(data_float))

#tipe data : kumpulan data karakter (string)
data_string = "ikmal"
print("data : ", data_string)
print("bertipe : ", type(data_string))

#tipe data : biner true/false (boolean)
data_bool = True
print("data : ", data_bool)
print("bertipe : ", type(data_bool))

##tipe data khusus

#bilangan kompleks
data_complex = complex(7,8)
print("data : ", data_complex)
print("bertipe : ", type(data_complex))

#tipe data dari bahasa c
 
from ctypes import c_double

data_c_double = c_double(1.7)
print("data : ", data_c_double)
print("bertipe : ", type(data_c_double))

a = 183742983
y = 782450273
panjang = 16

# pemanggilan pertama
print("Nilai a adalah ", a)
print("Nilai y adalah ", y)
print("Nilai panjang adalah ", panjang)

#penamaan
Nilai_y = 15 # dengan menggunakan underscore
juta10 = 10000000 #ini boleh
nilaiZ = 60.8 # ini boleh

# pemanggilan kedua
print("Nilai a adalah ", a)
a = 7
print("Nilai a adalah ", a)

# assigment indirect
b = a
print("Nilai b adalah ", b)