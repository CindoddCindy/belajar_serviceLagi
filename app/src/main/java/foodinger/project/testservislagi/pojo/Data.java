
package foodinger.project.testservislagi.pojo;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("post")
    @Expose
    private Post post;
    @SerializedName("mitra")
    @Expose
    private List<Mitra> mitra = new ArrayList<Mitra>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Data() {
    }

    /**
     * 
     * @param post
     * @param mitra
     */
    public Data(Post post, List<Mitra> mitra) {
        super();
        this.post = post;
        this.mitra = mitra;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Data withPost(Post post) {
        this.post = post;
        return this;
    }

    public List<Mitra> getMitra() {
        return mitra;
    }

    public void setMitra(List<Mitra> mitra) {
        this.mitra = mitra;
    }

    public Data withMitra(List<Mitra> mitra) {
        this.mitra = mitra;
        return this;
    }

}
