package com.example.doctree.DataModel;

public class NotificationModel {
    private int NotificationIcon;
    private String NotificationTitle;
    private String NotificationMessage;
    private String NotificationTime;

    public int getNotificationIcon() {
        return NotificationIcon;
    }

    public void setNotificationIcon(int notificationIcon) {
        NotificationIcon = notificationIcon;
    }

    public String getNotificationTitle() {
        return NotificationTitle;
    }

    public void setNotificationTitle(String notificationTitle) {
        NotificationTitle = notificationTitle;
    }

    public String getNotificationMessage() {
        return NotificationMessage;
    }

    public void setNotificationMessage(String notificationMessage) {
        NotificationMessage = notificationMessage;
    }

    public String getNotificationTime() {
        return NotificationTime;
    }

    public void setNotificationTime(String notificationTime) {
        NotificationTime = notificationTime;
    }

    public NotificationModel() {

    }
}
