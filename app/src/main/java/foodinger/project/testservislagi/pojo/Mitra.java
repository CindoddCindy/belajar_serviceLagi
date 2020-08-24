
package foodinger.project.testservislagi.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Mitra {

    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("user_login")
    @Expose
    private String userLogin;
    @SerializedName("user_pass")
    @Expose
    private String userPass;
    @SerializedName("user_nicename")
    @Expose
    private String userNicename;
    @SerializedName("user_email")
    @Expose
    private String userEmail;
    @SerializedName("user_url")
    @Expose
    private String userUrl;
    @SerializedName("user_registered")
    @Expose
    private String userRegistered;
    @SerializedName("user_activation_key")
    @Expose
    private String userActivationKey;
    @SerializedName("user_status")
    @Expose
    private long userStatus;
    @SerializedName("display_name")
    @Expose
    private String displayName;
    @SerializedName("zona_status")
    @Expose
    private String zonaStatus;
    @SerializedName("zona_lokasi")
    @Expose
    private String zonaLokasi;
    @SerializedName("zona_latitude")
    @Expose
    private String zonaLatitude;
    @SerializedName("zona_longitude")
    @Expose
    private long zonaLongitude;
    @SerializedName("zona_nama_depan")
    @Expose
    private String zonaNamaDepan;
    @SerializedName("zona_nama_belakang")
    @Expose
    private String zonaNamaBelakang;
    @SerializedName("zona_jenis_kelamin")
    @Expose
    private String zonaJenisKelamin;
    @SerializedName("zona_email")
    @Expose
    private String zonaEmail;
    @SerializedName("zona_telp")
    @Expose
    private long zonaTelp;
    @SerializedName("fcm_token")
    @Expose
    private Object fcmToken;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Mitra() {
    }

    /**
     * 
     * @param zonaLatitude
     * @param userStatus
     * @param displayName
     * @param zonaStatus
     * @param zonaEmail
     * @param userPass
     * @param zonaTelp
     * @param userRegistered
     * @param userNicename
     * @param zonaJenisKelamin
     * @param userLogin
     * @param zonaLongitude
     * @param userEmail
     * @param zonaNamaDepan
     * @param id
     * @param userActivationKey
     * @param zonaNamaBelakang
     * @param fcmToken
     * @param userUrl
     * @param zonaLokasi
     */
    public Mitra(long id, String userLogin, String userPass, String userNicename, String userEmail, String userUrl, String userRegistered, String userActivationKey, long userStatus, String displayName, String zonaStatus, String zonaLokasi, String zonaLatitude, long zonaLongitude, String zonaNamaDepan, String zonaNamaBelakang, String zonaJenisKelamin, String zonaEmail, long zonaTelp, Object fcmToken) {
        super();
        this.id = id;
        this.userLogin = userLogin;
        this.userPass = userPass;
        this.userNicename = userNicename;
        this.userEmail = userEmail;
        this.userUrl = userUrl;
        this.userRegistered = userRegistered;
        this.userActivationKey = userActivationKey;
        this.userStatus = userStatus;
        this.displayName = displayName;
        this.zonaStatus = zonaStatus;
        this.zonaLokasi = zonaLokasi;
        this.zonaLatitude = zonaLatitude;
        this.zonaLongitude = zonaLongitude;
        this.zonaNamaDepan = zonaNamaDepan;
        this.zonaNamaBelakang = zonaNamaBelakang;
        this.zonaJenisKelamin = zonaJenisKelamin;
        this.zonaEmail = zonaEmail;
        this.zonaTelp = zonaTelp;
        this.fcmToken = fcmToken;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Mitra withId(long id) {
        this.id = id;
        return this;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public Mitra withUserLogin(String userLogin) {
        this.userLogin = userLogin;
        return this;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public Mitra withUserPass(String userPass) {
        this.userPass = userPass;
        return this;
    }

    public String getUserNicename() {
        return userNicename;
    }

    public void setUserNicename(String userNicename) {
        this.userNicename = userNicename;
    }

    public Mitra withUserNicename(String userNicename) {
        this.userNicename = userNicename;
        return this;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Mitra withUserEmail(String userEmail) {
        this.userEmail = userEmail;
        return this;
    }

    public String getUserUrl() {
        return userUrl;
    }

    public void setUserUrl(String userUrl) {
        this.userUrl = userUrl;
    }

    public Mitra withUserUrl(String userUrl) {
        this.userUrl = userUrl;
        return this;
    }

    public String getUserRegistered() {
        return userRegistered;
    }

    public void setUserRegistered(String userRegistered) {
        this.userRegistered = userRegistered;
    }

    public Mitra withUserRegistered(String userRegistered) {
        this.userRegistered = userRegistered;
        return this;
    }

    public String getUserActivationKey() {
        return userActivationKey;
    }

    public void setUserActivationKey(String userActivationKey) {
        this.userActivationKey = userActivationKey;
    }

    public Mitra withUserActivationKey(String userActivationKey) {
        this.userActivationKey = userActivationKey;
        return this;
    }

    public long getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(long userStatus) {
        this.userStatus = userStatus;
    }

    public Mitra withUserStatus(long userStatus) {
        this.userStatus = userStatus;
        return this;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Mitra withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public String getZonaStatus() {
        return zonaStatus;
    }

    public void setZonaStatus(String zonaStatus) {
        this.zonaStatus = zonaStatus;
    }

    public Mitra withZonaStatus(String zonaStatus) {
        this.zonaStatus = zonaStatus;
        return this;
    }

    public String getZonaLokasi() {
        return zonaLokasi;
    }

    public void setZonaLokasi(String zonaLokasi) {
        this.zonaLokasi = zonaLokasi;
    }

    public Mitra withZonaLokasi(String zonaLokasi) {
        this.zonaLokasi = zonaLokasi;
        return this;
    }

    public String getZonaLatitude() {
        return zonaLatitude;
    }

    public void setZonaLatitude(String zonaLatitude) {
        this.zonaLatitude = zonaLatitude;
    }

    public Mitra withZonaLatitude(String zonaLatitude) {
        this.zonaLatitude = zonaLatitude;
        return this;
    }

    public long getZonaLongitude() {
        return zonaLongitude;
    }

    public void setZonaLongitude(long zonaLongitude) {
        this.zonaLongitude = zonaLongitude;
    }

    public Mitra withZonaLongitude(long zonaLongitude) {
        this.zonaLongitude = zonaLongitude;
        return this;
    }

    public String getZonaNamaDepan() {
        return zonaNamaDepan;
    }

    public void setZonaNamaDepan(String zonaNamaDepan) {
        this.zonaNamaDepan = zonaNamaDepan;
    }

    public Mitra withZonaNamaDepan(String zonaNamaDepan) {
        this.zonaNamaDepan = zonaNamaDepan;
        return this;
    }

    public String getZonaNamaBelakang() {
        return zonaNamaBelakang;
    }

    public void setZonaNamaBelakang(String zonaNamaBelakang) {
        this.zonaNamaBelakang = zonaNamaBelakang;
    }

    public Mitra withZonaNamaBelakang(String zonaNamaBelakang) {
        this.zonaNamaBelakang = zonaNamaBelakang;
        return this;
    }

    public String getZonaJenisKelamin() {
        return zonaJenisKelamin;
    }

    public void setZonaJenisKelamin(String zonaJenisKelamin) {
        this.zonaJenisKelamin = zonaJenisKelamin;
    }

    public Mitra withZonaJenisKelamin(String zonaJenisKelamin) {
        this.zonaJenisKelamin = zonaJenisKelamin;
        return this;
    }

    public String getZonaEmail() {
        return zonaEmail;
    }

    public void setZonaEmail(String zonaEmail) {
        this.zonaEmail = zonaEmail;
    }

    public Mitra withZonaEmail(String zonaEmail) {
        this.zonaEmail = zonaEmail;
        return this;
    }

    public long getZonaTelp() {
        return zonaTelp;
    }

    public void setZonaTelp(long zonaTelp) {
        this.zonaTelp = zonaTelp;
    }

    public Mitra withZonaTelp(long zonaTelp) {
        this.zonaTelp = zonaTelp;
        return this;
    }

    public Object getFcmToken() {
        return fcmToken;
    }

    public void setFcmToken(Object fcmToken) {
        this.fcmToken = fcmToken;
    }

    public Mitra withFcmToken(Object fcmToken) {
        this.fcmToken = fcmToken;
        return this;
    }

}
