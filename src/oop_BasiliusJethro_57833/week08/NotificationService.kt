package oop_BasiliusJethro_57833.week08

class NotificationService {

    fun sendEmail(user: UserProfile) {
        if (user.email != null) {
            println("Sending email to ${user.email}")
        } else {
            println("No email available")
        }
    }
}