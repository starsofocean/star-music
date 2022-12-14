package com.starsofocean.music.mapper;

import com.starsofocean.music.model.Mylove;
import com.starsofocean.music.model.MyloveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MyloveMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mylove
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    long countByExample(MyloveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mylove
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    int deleteByExample(MyloveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mylove
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mylove
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    int insert(Mylove record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mylove
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    int insertSelective(Mylove record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mylove
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    List<Mylove> selectByExample(MyloveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mylove
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    Mylove selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mylove
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    int updateByExampleSelective(@Param("record") Mylove record, @Param("example") MyloveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mylove
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    int updateByExample(@Param("record") Mylove record, @Param("example") MyloveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mylove
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    int updateByPrimaryKeySelective(Mylove record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mylove
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    int updateByPrimaryKey(Mylove record);
}