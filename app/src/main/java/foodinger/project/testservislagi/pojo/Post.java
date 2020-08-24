
package foodinger.project.testservislagi.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Post {

    @SerializedName("ID")
    @Expose
    private long iD;
    @SerializedName("post_author")
    @Expose
    private long postAuthor;
    @SerializedName("post_date")
    @Expose
    private String postDate;
    @SerializedName("post_date_gmt")
    @Expose
    private String postDateGmt;
    @SerializedName("post_content")
    @Expose
    private String postContent;
    @SerializedName("post_title")
    @Expose
    private String postTitle;
    @SerializedName("post_excerpt")
    @Expose
    private String postExcerpt;
    @SerializedName("post_status")
    @Expose
    private String postStatus;
    @SerializedName("comment_status")
    @Expose
    private String commentStatus;
    @SerializedName("ping_status")
    @Expose
    private String pingStatus;
    @SerializedName("post_password")
    @Expose
    private String postPassword;
    @SerializedName("post_name")
    @Expose
    private String postName;
    @SerializedName("to_ping")
    @Expose
    private String toPing;
    @SerializedName("pinged")
    @Expose
    private String pinged;
    @SerializedName("post_modified")
    @Expose
    private String postModified;
    @SerializedName("post_modified_gmt")
    @Expose
    private String postModifiedGmt;
    @SerializedName("post_content_filtered")
    @Expose
    private String postContentFiltered;
    @SerializedName("post_parent")
    @Expose
    private long postParent;
    @SerializedName("guid")
    @Expose
    private String guid;
    @SerializedName("menu_order")
    @Expose
    private long menuOrder;
    @SerializedName("post_type")
    @Expose
    private String postType;
    @SerializedName("post_mime_type")
    @Expose
    private String postMimeType;
    @SerializedName("comment_count")
    @Expose
    private long commentCount;
    @SerializedName("zona_jenis_kelamin")
    @Expose
    private String zonaJenisKelamin;
    @SerializedName("zona_nama_lengkap")
    @Expose
    private String zonaNamaLengkap;
    @SerializedName("zona_nama_produk")
    @Expose
    private String zonaNamaProduk;
    @SerializedName("zona_durasi_produk")
    @Expose
    private String zonaDurasiProduk;
    @SerializedName("zona_telp")
    @Expose
    private long zonaTelp;
    @SerializedName("zona_jenis_kelamin_terapis")
    @Expose
    private String zonaJenisKelaminTerapis;
    @SerializedName("zona_lokasi")
    @Expose
    private String zonaLokasi;
    @SerializedName("zona_tanggal_pesanan")
    @Expose
    private String zonaTanggalPesanan;
    @SerializedName("zona_catatan")
    @Expose
    private String zonaCatatan;
    @SerializedName("zona_subtotal")
    @Expose
    private String zonaSubtotal;
    @SerializedName("zona_extra_fee")
    @Expose
    private String zonaExtraFee;
    @SerializedName("zona_total_order")
    @Expose
    private String zonaTotalOrder;
    @SerializedName("zona_status_order")
    @Expose
    private String zonaStatusOrder;
    @SerializedName("zona_id_produk")
    @Expose
    private long zonaIdProduk;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Post() {
    }

    /**
     * 
     * @param zonaIdProduk
     * @param postModified
     * @param postStatus
     * @param pinged
     * @param zonaCatatan
     * @param pingStatus
     * @param postMimeType
     * @param postContentFiltered
     * @param zonaJenisKelamin
     * @param zonaExtraFee
     * @param zonaTotalOrder
     * @param postAuthor
     * @param postName
     * @param zonaSubtotal
     * @param zonaNamaLengkap
     * @param postTitle
     * @param postPassword
     * @param zonaLokasi
     * @param postExcerpt
     * @param postContent
     * @param postType
     * @param postModifiedGmt
     * @param postDateGmt
     * @param zonaTelp
     * @param commentStatus
     * @param commentCount
     * @param zonaDurasiProduk
     * @param menuOrder
     * @param zonaStatusOrder
     * @param postDate
     * @param toPing
     * @param guid
     * @param iD
     * @param zonaNamaProduk
     * @param postParent
     * @param zonaJenisKelaminTerapis
     * @param zonaTanggalPesanan
     */
    public Post(long iD, long postAuthor, String postDate, String postDateGmt, String postContent, String postTitle, String postExcerpt, String postStatus, String commentStatus, String pingStatus, String postPassword, String postName, String toPing, String pinged, String postModified, String postModifiedGmt, String postContentFiltered, long postParent, String guid, long menuOrder, String postType, String postMimeType, long commentCount, String zonaJenisKelamin, String zonaNamaLengkap, String zonaNamaProduk, String zonaDurasiProduk, long zonaTelp, String zonaJenisKelaminTerapis, String zonaLokasi, String zonaTanggalPesanan, String zonaCatatan, String zonaSubtotal, String zonaExtraFee, String zonaTotalOrder, String zonaStatusOrder, long zonaIdProduk) {
        super();
        this.iD = iD;
        this.postAuthor = postAuthor;
        this.postDate = postDate;
        this.postDateGmt = postDateGmt;
        this.postContent = postContent;
        this.postTitle = postTitle;
        this.postExcerpt = postExcerpt;
        this.postStatus = postStatus;
        this.commentStatus = commentStatus;
        this.pingStatus = pingStatus;
        this.postPassword = postPassword;
        this.postName = postName;
        this.toPing = toPing;
        this.pinged = pinged;
        this.postModified = postModified;
        this.postModifiedGmt = postModifiedGmt;
        this.postContentFiltered = postContentFiltered;
        this.postParent = postParent;
        this.guid = guid;
        this.menuOrder = menuOrder;
        this.postType = postType;
        this.postMimeType = postMimeType;
        this.commentCount = commentCount;
        this.zonaJenisKelamin = zonaJenisKelamin;
        this.zonaNamaLengkap = zonaNamaLengkap;
        this.zonaNamaProduk = zonaNamaProduk;
        this.zonaDurasiProduk = zonaDurasiProduk;
        this.zonaTelp = zonaTelp;
        this.zonaJenisKelaminTerapis = zonaJenisKelaminTerapis;
        this.zonaLokasi = zonaLokasi;
        this.zonaTanggalPesanan = zonaTanggalPesanan;
        this.zonaCatatan = zonaCatatan;
        this.zonaSubtotal = zonaSubtotal;
        this.zonaExtraFee = zonaExtraFee;
        this.zonaTotalOrder = zonaTotalOrder;
        this.zonaStatusOrder = zonaStatusOrder;
        this.zonaIdProduk = zonaIdProduk;
    }

    public long getID() {
        return iD;
    }

    public void setID(long iD) {
        this.iD = iD;
    }

    public Post withID(long iD) {
        this.iD = iD;
        return this;
    }

    public long getPostAuthor() {
        return postAuthor;
    }

    public void setPostAuthor(long postAuthor) {
        this.postAuthor = postAuthor;
    }

    public Post withPostAuthor(long postAuthor) {
        this.postAuthor = postAuthor;
        return this;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }

    public Post withPostDate(String postDate) {
        this.postDate = postDate;
        return this;
    }

    public String getPostDateGmt() {
        return postDateGmt;
    }

    public void setPostDateGmt(String postDateGmt) {
        this.postDateGmt = postDateGmt;
    }

    public Post withPostDateGmt(String postDateGmt) {
        this.postDateGmt = postDateGmt;
        return this;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public Post withPostContent(String postContent) {
        this.postContent = postContent;
        return this;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public Post withPostTitle(String postTitle) {
        this.postTitle = postTitle;
        return this;
    }

    public String getPostExcerpt() {
        return postExcerpt;
    }

    public void setPostExcerpt(String postExcerpt) {
        this.postExcerpt = postExcerpt;
    }

    public Post withPostExcerpt(String postExcerpt) {
        this.postExcerpt = postExcerpt;
        return this;
    }

    public String getPostStatus() {
        return postStatus;
    }

    public void setPostStatus(String postStatus) {
        this.postStatus = postStatus;
    }

    public Post withPostStatus(String postStatus) {
        this.postStatus = postStatus;
        return this;
    }

    public String getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus;
    }

    public Post withCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus;
        return this;
    }

    public String getPingStatus() {
        return pingStatus;
    }

    public void setPingStatus(String pingStatus) {
        this.pingStatus = pingStatus;
    }

    public Post withPingStatus(String pingStatus) {
        this.pingStatus = pingStatus;
        return this;
    }

    public String getPostPassword() {
        return postPassword;
    }

    public void setPostPassword(String postPassword) {
        this.postPassword = postPassword;
    }

    public Post withPostPassword(String postPassword) {
        this.postPassword = postPassword;
        return this;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public Post withPostName(String postName) {
        this.postName = postName;
        return this;
    }

    public String getToPing() {
        return toPing;
    }

    public void setToPing(String toPing) {
        this.toPing = toPing;
    }

    public Post withToPing(String toPing) {
        this.toPing = toPing;
        return this;
    }

    public String getPinged() {
        return pinged;
    }

    public void setPinged(String pinged) {
        this.pinged = pinged;
    }

    public Post withPinged(String pinged) {
        this.pinged = pinged;
        return this;
    }

    public String getPostModified() {
        return postModified;
    }

    public void setPostModified(String postModified) {
        this.postModified = postModified;
    }

    public Post withPostModified(String postModified) {
        this.postModified = postModified;
        return this;
    }

    public String getPostModifiedGmt() {
        return postModifiedGmt;
    }

    public void setPostModifiedGmt(String postModifiedGmt) {
        this.postModifiedGmt = postModifiedGmt;
    }

    public Post withPostModifiedGmt(String postModifiedGmt) {
        this.postModifiedGmt = postModifiedGmt;
        return this;
    }

    public String getPostContentFiltered() {
        return postContentFiltered;
    }

    public void setPostContentFiltered(String postContentFiltered) {
        this.postContentFiltered = postContentFiltered;
    }

    public Post withPostContentFiltered(String postContentFiltered) {
        this.postContentFiltered = postContentFiltered;
        return this;
    }

    public long getPostParent() {
        return postParent;
    }

    public void setPostParent(long postParent) {
        this.postParent = postParent;
    }

    public Post withPostParent(long postParent) {
        this.postParent = postParent;
        return this;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Post withGuid(String guid) {
        this.guid = guid;
        return this;
    }

    public long getMenuOrder() {
        return menuOrder;
    }

    public void setMenuOrder(long menuOrder) {
        this.menuOrder = menuOrder;
    }

    public Post withMenuOrder(long menuOrder) {
        this.menuOrder = menuOrder;
        return this;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public Post withPostType(String postType) {
        this.postType = postType;
        return this;
    }

    public String getPostMimeType() {
        return postMimeType;
    }

    public void setPostMimeType(String postMimeType) {
        this.postMimeType = postMimeType;
    }

    public Post withPostMimeType(String postMimeType) {
        this.postMimeType = postMimeType;
        return this;
    }

    public long getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(long commentCount) {
        this.commentCount = commentCount;
    }

    public Post withCommentCount(long commentCount) {
        this.commentCount = commentCount;
        return this;
    }

    public String getZonaJenisKelamin() {
        return zonaJenisKelamin;
    }

    public void setZonaJenisKelamin(String zonaJenisKelamin) {
        this.zonaJenisKelamin = zonaJenisKelamin;
    }

    public Post withZonaJenisKelamin(String zonaJenisKelamin) {
        this.zonaJenisKelamin = zonaJenisKelamin;
        return this;
    }

    public String getZonaNamaLengkap() {
        return zonaNamaLengkap;
    }

    public void setZonaNamaLengkap(String zonaNamaLengkap) {
        this.zonaNamaLengkap = zonaNamaLengkap;
    }

    public Post withZonaNamaLengkap(String zonaNamaLengkap) {
        this.zonaNamaLengkap = zonaNamaLengkap;
        return this;
    }

    public String getZonaNamaProduk() {
        return zonaNamaProduk;
    }

    public void setZonaNamaProduk(String zonaNamaProduk) {
        this.zonaNamaProduk = zonaNamaProduk;
    }

    public Post withZonaNamaProduk(String zonaNamaProduk) {
        this.zonaNamaProduk = zonaNamaProduk;
        return this;
    }

    public String getZonaDurasiProduk() {
        return zonaDurasiProduk;
    }

    public void setZonaDurasiProduk(String zonaDurasiProduk) {
        this.zonaDurasiProduk = zonaDurasiProduk;
    }

    public Post withZonaDurasiProduk(String zonaDurasiProduk) {
        this.zonaDurasiProduk = zonaDurasiProduk;
        return this;
    }

    public long getZonaTelp() {
        return zonaTelp;
    }

    public void setZonaTelp(long zonaTelp) {
        this.zonaTelp = zonaTelp;
    }

    public Post withZonaTelp(long zonaTelp) {
        this.zonaTelp = zonaTelp;
        return this;
    }

    public String getZonaJenisKelaminTerapis() {
        return zonaJenisKelaminTerapis;
    }

    public void setZonaJenisKelaminTerapis(String zonaJenisKelaminTerapis) {
        this.zonaJenisKelaminTerapis = zonaJenisKelaminTerapis;
    }

    public Post withZonaJenisKelaminTerapis(String zonaJenisKelaminTerapis) {
        this.zonaJenisKelaminTerapis = zonaJenisKelaminTerapis;
        return this;
    }

    public String getZonaLokasi() {
        return zonaLokasi;
    }

    public void setZonaLokasi(String zonaLokasi) {
        this.zonaLokasi = zonaLokasi;
    }

    public Post withZonaLokasi(String zonaLokasi) {
        this.zonaLokasi = zonaLokasi;
        return this;
    }

    public String getZonaTanggalPesanan() {
        return zonaTanggalPesanan;
    }

    public void setZonaTanggalPesanan(String zonaTanggalPesanan) {
        this.zonaTanggalPesanan = zonaTanggalPesanan;
    }

    public Post withZonaTanggalPesanan(String zonaTanggalPesanan) {
        this.zonaTanggalPesanan = zonaTanggalPesanan;
        return this;
    }

    public String getZonaCatatan() {
        return zonaCatatan;
    }

    public void setZonaCatatan(String zonaCatatan) {
        this.zonaCatatan = zonaCatatan;
    }

    public Post withZonaCatatan(String zonaCatatan) {
        this.zonaCatatan = zonaCatatan;
        return this;
    }

    public String getZonaSubtotal() {
        return zonaSubtotal;
    }

    public void setZonaSubtotal(String zonaSubtotal) {
        this.zonaSubtotal = zonaSubtotal;
    }

    public Post withZonaSubtotal(String zonaSubtotal) {
        this.zonaSubtotal = zonaSubtotal;
        return this;
    }

    public String getZonaExtraFee() {
        return zonaExtraFee;
    }

    public void setZonaExtraFee(String zonaExtraFee) {
        this.zonaExtraFee = zonaExtraFee;
    }

    public Post withZonaExtraFee(String zonaExtraFee) {
        this.zonaExtraFee = zonaExtraFee;
        return this;
    }

    public String getZonaTotalOrder() {
        return zonaTotalOrder;
    }

    public void setZonaTotalOrder(String zonaTotalOrder) {
        this.zonaTotalOrder = zonaTotalOrder;
    }

    public Post withZonaTotalOrder(String zonaTotalOrder) {
        this.zonaTotalOrder = zonaTotalOrder;
        return this;
    }

    public String getZonaStatusOrder() {
        return zonaStatusOrder;
    }

    public void setZonaStatusOrder(String zonaStatusOrder) {
        this.zonaStatusOrder = zonaStatusOrder;
    }

    public Post withZonaStatusOrder(String zonaStatusOrder) {
        this.zonaStatusOrder = zonaStatusOrder;
        return this;
    }

    public long getZonaIdProduk() {
        return zonaIdProduk;
    }

    public void setZonaIdProduk(long zonaIdProduk) {
        this.zonaIdProduk = zonaIdProduk;
    }

    public Post withZonaIdProduk(long zonaIdProduk) {
        this.zonaIdProduk = zonaIdProduk;
        return this;
    }

}
