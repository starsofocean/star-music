package com.starsofocean.music.model;

import java.io.Serializable;

public class Mv implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mv.id
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mv.name
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mv.url
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    private String url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mv.song_id
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    private Long songId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mv.introduction
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    private String introduction;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mv.pic
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    private String pic;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table mv
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mv.id
     *
     * @return the value of mv.id
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mv.id
     *
     * @param id the value for mv.id
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mv.name
     *
     * @return the value of mv.name
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mv.name
     *
     * @param name the value for mv.name
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mv.url
     *
     * @return the value of mv.url
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mv.url
     *
     * @param url the value for mv.url
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mv.song_id
     *
     * @return the value of mv.song_id
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    public Long getSongId() {
        return songId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mv.song_id
     *
     * @param songId the value for mv.song_id
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    public void setSongId(Long songId) {
        this.songId = songId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mv.introduction
     *
     * @return the value of mv.introduction
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mv.introduction
     *
     * @param introduction the value for mv.introduction
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mv.pic
     *
     * @return the value of mv.pic
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    public String getPic() {
        return pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mv.pic
     *
     * @param pic the value for mv.pic
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    public void setPic(String pic) {
        this.pic = pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mv
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", url=").append(url);
        sb.append(", songId=").append(songId);
        sb.append(", introduction=").append(introduction);
        sb.append(", pic=").append(pic);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}