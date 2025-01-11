# Akıllı Ev Sistemi

![Java](https://img.shields.io/badge/Java-17-007396?style=for-the-badge&logo=java&logoColor=white)
![Status](https://img.shields.io/badge/Status-Active-228B22?style=for-the-badge&logo=verizon&logoColor=white)
![School Project](https://img.shields.io/badge/School%20Project-OOP-blue?style=for-the-badge&logo=school&logoColor=white)

## Proje Açıklaması

Akıllı Ev Sistemi projesi, akıllı cihazların yönetimini ve güvenlik modlarının kontrolünü sağlayan bir Java uygulamasıdır. Bu sistem, kullanıcıların cihazları eklemesine, açıp kapatmasına, güvenlik modlarını değiştirmesine ve kullanıcıları bilgilendirmesine olanak tanır. Yazılım, sürdürülebilirliği artırmak için birden fazla tasarım deseniyle geliştirilmiştir.

## Özellikler

- **Cihaz Ekleme**: Yeni bir cihaz ekleyebilirsiniz.
- **Cihaz Durumu Yönetimi**: Cihazları açabilir veya kapatabilirsiniz.
- **Güvenlik Modları**: "Ev Modu" veya "Dışarı Modu" seçenekleriyle güvenlik modlarını değiştirebilirsiniz.
- **Kullanıcı Yönetimi**: Yeni kullanıcılar eklenebilir ve kullanıcılar güvenlik modu değişikliklerinde bilgilendirilir.


## Kullanılan Tasarım Desenleri

1. **Singleton Deseni**:
   - Yöneticiler (`DeviceManager`, `UserManager`, `SecurityModeManager`) tek bir örnekle yönetilir.
2. **Command Deseni**:
   - Kullanıcı işlemleri için her bir menü seçeneği bir komut sınıfına ayrılmıştır.
3. **Factory Deseni**:
   - Komut nesnelerinin dinamik oluşturulması için kullanılmıştır.
4. **Iterator Deseni**:
   - Cihaz listesi üzerinde dolaşmak için uygulanmıştır.
5. **Template Method Deseni**:
   - Bildirim işlemleri için bir şablon sağlanmıştır.
6. **Observer Deseni**:
   - Güvenlik modu değişikliklerinde kullanıcılar bilgilendirilir.


## Gereksinimler

- **Java 17**
- **Maven**

