# Втора лабораториска вежба по Софтверско инженерство

## Андреј Колевски, бр. на индекс 181195

### Control Flow Graph

![image](https://github.com/Kolevski99/SI_2023_lab2_181195/assets/74427070/11ff272d-7db0-4b5b-93a8-d544d9ff97b4)

### Цикломатска комплексност

Цикломатската комплексност на овој код е 11, истата ја добив преку формулата P+1, каде што P е бројот на предикатни јазли. Во случајoв P=10, па цикломатската комплексност изнесува 11.

1.	if (user==null || user.getPassword()==null || user.getEmail()==null)
2.	if (user.getUsername()==null)
3.	if (user.getEmail().contains("@") && user.getEmail().contains("."))
4.	for (int i=0;i<allUsers.size();i++)
5.	if (existingUser.getEmail() == user.getEmail())
6.	if (existingUser.getUsername() == user.getUsername())
7.	if (passwordLower.contains(user.getUsername().toLowerCase()) || password.length()<8)
8.	if (!passwordLower.contains(" "))
9.	for (int i = 0; i < specialCharacters.length(); i++)
10.	if (password.contains(String.valueOf(specialCharacters.charAt(i))))
