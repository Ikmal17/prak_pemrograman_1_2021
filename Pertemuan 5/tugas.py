print("===== BISMILLAH =====")

print("====== TUGAS 5 ======")

print("Ikmal Dwi Darmawan")

nim = 21537144025
print("NIM = ", nim)

kelas = 'Jclass'
print("Kelas = ", kelas)

print('\n')

#Buatlah program sederhana yang dapat mengetahui seseorang tersebut memiliki predikat kelulusan :
ipk = input("Masukkan IPK anda = ")
lulus = input("Lulus dalam = ")
ipk = float(ipk)
lulus = int(lulus)
#a. Dengan pujian tertinggi (Summa Cumlaude): IPK >= 3.51 dan lulus dalam <= 4 tahun
if (ipk >= 3.51 and lulus <= 4):
    print("Summa Cumlaude")
#b. Dengan pujian (Cumlaude); IPK >= 3.51
elif(ipk >= 3.51):
    print("Cumlaude")
#c. Sangat memuaskan : IPK >= 3.01 dan IPK < 3.51
elif(ipk >= 3.01 and ipk < 3.51):
    print("Sangat memuaskan")
#d. Memuaskan : IPK >= 2.76 dan IPK < 3.01
elif(ipk >= 2.76 and ipk < 3.01):
    print("Memuaskan")
#e. Cukup : IPK >= 2.00 dan IPK , 2.76
elif(ipk >= 2.00 and ipk < 2.76):
    print("Cukup")
#f. Tidak lulus : IPK < 2.00
elif(ipk < 2.00):
    print("Tidak lulus")
#g. Tidak valid : IPK > 4 atau IPK < 0
else:
    print("Tidak Valid")

print('\n')

print("===== Terima kasih =====")