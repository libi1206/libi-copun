package org.libi.evidence.impl.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author wanghaifeng
 * @date 2022-03-11 23:30:55
 */
@TableName("evidence")
public class EvidenceDo implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 存证id
	 */
	private String evidenceId;
	/**
	 * 
	 */
	private Date createTime;
	/**
	 * 
	 */
	private Date updateTime;
	/**
	 * 是否删除
	 */
	private Integer isDelete;
	/**
	 * 
	 */
	private Integer version;
	/**
	 * 应用id
	 */
	private String appId;
	/**
	 * 提取码
	 */
	private String extractionCode;
	/**
	 * 存证哈希
	 */
	private String hash;
	/**
	 * 存证名称
	 */
	private String name;
	/**
	 * 
	 */
	private Date shareTime;
	/**
	 * 存证类型
	 */
	private Integer type;
	/**
	 * 文件地址
	 */
	private String url;
	/**
	 * 用户id
	 */
	private String userId;
	/**
	 * 交易区块哈希
	 */
	private String txHash;
	/**
	 * 
	 */
	private String lat;
	/**
	 * 
	 */
	private String lng;
	/**
	 * room_id
	 */
	private String roomId;
	/**
	 * uuid
	 */
	private String uuid;
	/**
	 * 公证状态 0，未公证 1 已公证 NotarizeListStatus
	 */
	private Integer notarizeStatus;

	/**
	 * 设置：
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：存证id
	 */
	public void setEvidenceId(String evidenceId) {
		this.evidenceId = evidenceId;
	}
	/**
	 * 获取：存证id
	 */
	public String getEvidenceId() {
		return evidenceId;
	}
	/**
	 * 设置：
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * 设置：是否删除
	 */
	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}
	/**
	 * 获取：是否删除
	 */
	public Integer getIsDelete() {
		return isDelete;
	}
	/**
	 * 设置：
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}
	/**
	 * 获取：
	 */
	public Integer getVersion() {
		return version;
	}
	/**
	 * 设置：应用id
	 */
	public void setAppId(String appId) {
		this.appId = appId;
	}
	/**
	 * 获取：应用id
	 */
	public String getAppId() {
		return appId;
	}
	/**
	 * 设置：提取码
	 */
	public void setExtractionCode(String extractionCode) {
		this.extractionCode = extractionCode;
	}
	/**
	 * 获取：提取码
	 */
	public String getExtractionCode() {
		return extractionCode;
	}
	/**
	 * 设置：存证哈希
	 */
	public void setHash(String hash) {
		this.hash = hash;
	}
	/**
	 * 获取：存证哈希
	 */
	public String getHash() {
		return hash;
	}
	/**
	 * 设置：存证名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：存证名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：
	 */
	public void setShareTime(Date shareTime) {
		this.shareTime = shareTime;
	}
	/**
	 * 获取：
	 */
	public Date getShareTime() {
		return shareTime;
	}
	/**
	 * 设置：存证类型
	 */
	public void setType(Integer type) {
		this.type = type;
	}
	/**
	 * 获取：存证类型
	 */
	public Integer getType() {
		return type;
	}
	/**
	 * 设置：文件地址
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * 获取：文件地址
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * 设置：用户id
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * 获取：用户id
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * 设置：交易区块哈希
	 */
	public void setTxHash(String txHash) {
		this.txHash = txHash;
	}
	/**
	 * 获取：交易区块哈希
	 */
	public String getTxHash() {
		return txHash;
	}
	/**
	 * 设置：
	 */
	public void setLat(String lat) {
		this.lat = lat;
	}
	/**
	 * 获取：
	 */
	public String getLat() {
		return lat;
	}
	/**
	 * 设置：
	 */
	public void setLng(String lng) {
		this.lng = lng;
	}
	/**
	 * 获取：
	 */
	public String getLng() {
		return lng;
	}
	/**
	 * 设置：room_id
	 */
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	/**
	 * 获取：room_id
	 */
	public String getRoomId() {
		return roomId;
	}
	/**
	 * 设置：uuid
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	/**
	 * 获取：uuid
	 */
	public String getUuid() {
		return uuid;
	}
	/**
	 * 设置：公证状态 0，未公证 1 已公证 NotarizeListStatus
	 */
	public void setNotarizeStatus(Integer notarizeStatus) {
		this.notarizeStatus = notarizeStatus;
	}
	/**
	 * 获取：公证状态 0，未公证 1 已公证 NotarizeListStatus
	 */
	public Integer getNotarizeStatus() {
		return notarizeStatus;
	}
}
