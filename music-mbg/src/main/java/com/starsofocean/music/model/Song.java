package com.starsofocean.music.model;

import java.io.Serializable;

public class Song implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column song.id
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column song.name
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column song.album_id
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    private Long albumId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column song.singer_id
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    private Long singerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column song.pic
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    private String pic;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column song.url
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    private String url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column song.vip
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    private Integer vip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column song.mv_id
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    private Long mvId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column song.lyric
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    private String lyric;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table song
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column song.id
     *
     * @return the value of song.id
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column song.id
     *
     * @param id the value for song.id
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column song.name
     *
     * @return the value of song.name
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column song.name
     *
     * @param name the value for song.name
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column song.album_id
     *
     * @return the value of song.album_id
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    public Long getAlbumId() {
        return albumId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column song.album_id
     *
     * @param albumId the value for song.album_id
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    public void setAlbumId(Long albumId) {
        this.albumId = albumId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column song.singer_id
     *
     * @return the value of song.singer_id
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    public Long getSingerId() {
        return singerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column song.singer_id
     *
     * @param singerId the value for song.singer_id
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    public void setSingerId(Long singerId) {
        this.singerId = singerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column song.pic
     *
     * @return the value of song.pic
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    public String getPic() {
        return pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column song.pic
     *
     * @param pic the value for song.pic
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    public void setPic(String pic) {
        this.pic = pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column song.url
     *
     * @return the value of song.url
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column song.url
     *
     * @param url the value for song.url
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column song.vip
     *
     * @return the value of song.vip
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    public Integer getVip() {
        return vip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column song.vip
     *
     * @param vip the value for song.vip
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    public void setVip(Integer vip) {
        this.vip = vip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column song.mv_id
     *
     * @return the value of song.mv_id
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    public Long getMvId() {
        return mvId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column song.mv_id
     *
     * @param mvId the value for song.mv_id
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    public void setMvId(Long mvId) {
        this.mvId = mvId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column song.lyric
     *
     * @return the value of song.lyric
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    public String getLyric() {
        return lyric;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column song.lyric
     *
     * @param lyric the value for song.lyric
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    public void setLyric(String lyric) {
        this.lyric = lyric;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table song
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
        sb.append(", albumId=").append(albumId);
        sb.append(", singerId=").append(singerId);
        sb.append(", pic=").append(pic);
        sb.append(", url=").append(url);
        sb.append(", vip=").append(vip);
        sb.append(", mvId=").append(mvId);
        sb.append(", lyric=").append(lyric);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}