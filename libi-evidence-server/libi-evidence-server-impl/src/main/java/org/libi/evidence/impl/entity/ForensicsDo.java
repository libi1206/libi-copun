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
@TableName("forensics")
public class ForensicsDo implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 主键uuid
	 */
	private String forensicId;
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
	 * 取证地址
	 */
	private String address;
	/**
	 * 提取码
	 */
	private String extractionCode;
	/**
	 * 存证哈希
	 */
	private String hash;
	/**
	 * 取证名称
	 */
	private String name;
	/**
	 * 取证状态
	 */
	private Integer status;
	/**
	 * 取证方式
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
	 * 套餐id
	 */
	private String usageId;
	/**
	 * 确认函上链的哈希
	 */
	private String certHash;
	/**
	 * 确认函上链的交易哈希
	 */
	private String certTxHash;
	/**
	 * 确认函所在的文件url
	 */
	private String certUrl;
	/**
	 * 交易哈希
	 */
	private String txHash;
	/**
	 * gps
	 */
	private String gps;
	/**
	 * 根据gps推断出的地址
	 */
	private String gpsAddress;
	/**
	 * size
	 */
	private String size;
	/**
	 * uuid
	 */
	private String uuid;
	/**
	 * url
	 */
	private String downloadUrl;
	/**
	 * 取证开始时间
	 */
	private Date forTime;
	/**
	 * 取证结束时间
	 */
	private Date endTime;
	/**
	 * 
	 */
	private String proxyAddress;
	/**
	 * 
	 */
	private String advAddress;
	/**
	 * 
	 */
	private String screen;
	/**
	 * 
	 */
	private String phoneModel;
	/**
	 * 
	 */
	private Integer browserValue;
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
	 * 取证时长（单位秒）
	 */
	private Integer durationSec;

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
	 * 设置：主键uuid
	 */
	public void setForensicId(String forensicId) {
		this.forensicId = forensicId;
	}
	/**
	 * 获取：主键uuid
	 */
	public String getForensicId() {
		return forensicId;
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
	 * 设置：取证地址
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * 获取：取证地址
	 */
	public String getAddress() {
		return address;
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
	 * 设置：取证名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：取证名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：取证状态
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：取证状态
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：取证方式
	 */
	public void setType(Integer type) {
		this.type = type;
	}
	/**
	 * 获取：取证方式
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
	 * 设置：套餐id
	 */
	public void setUsageId(String usageId) {
		this.usageId = usageId;
	}
	/**
	 * 获取：套餐id
	 */
	public String getUsageId() {
		return usageId;
	}
	/**
	 * 设置：确认函上链的哈希
	 */
	public void setCertHash(String certHash) {
		this.certHash = certHash;
	}
	/**
	 * 获取：确认函上链的哈希
	 */
	public String getCertHash() {
		return certHash;
	}
	/**
	 * 设置：确认函上链的交易哈希
	 */
	public void setCertTxHash(String certTxHash) {
		this.certTxHash = certTxHash;
	}
	/**
	 * 获取：确认函上链的交易哈希
	 */
	public String getCertTxHash() {
		return certTxHash;
	}
	/**
	 * 设置：确认函所在的文件url
	 */
	public void setCertUrl(String certUrl) {
		this.certUrl = certUrl;
	}
	/**
	 * 获取：确认函所在的文件url
	 */
	public String getCertUrl() {
		return certUrl;
	}
	/**
	 * 设置：交易哈希
	 */
	public void setTxHash(String txHash) {
		this.txHash = txHash;
	}
	/**
	 * 获取：交易哈希
	 */
	public String getTxHash() {
		return txHash;
	}
	/**
	 * 设置：gps
	 */
	public void setGps(String gps) {
		this.gps = gps;
	}
	/**
	 * 获取：gps
	 */
	public String getGps() {
		return gps;
	}
	/**
	 * 设置：根据gps推断出的地址
	 */
	public void setGpsAddress(String gpsAddress) {
		this.gpsAddress = gpsAddress;
	}
	/**
	 * 获取：根据gps推断出的地址
	 */
	public String getGpsAddress() {
		return gpsAddress;
	}
	/**
	 * 设置：size
	 */
	public void setSize(String size) {
		this.size = size;
	}
	/**
	 * 获取：size
	 */
	public String getSize() {
		return size;
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
	 * 设置：url
	 */
	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}
	/**
	 * 获取：url
	 */
	public String getDownloadUrl() {
		return downloadUrl;
	}
	/**
	 * 设置：取证开始时间
	 */
	public void setForTime(Date forTime) {
		this.forTime = forTime;
	}
	/**
	 * 获取：取证开始时间
	 */
	public Date getForTime() {
		return forTime;
	}
	/**
	 * 设置：取证结束时间
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	/**
	 * 获取：取证结束时间
	 */
	public Date getEndTime() {
		return endTime;
	}
	/**
	 * 设置：
	 */
	public void setProxyAddress(String proxyAddress) {
		this.proxyAddress = proxyAddress;
	}
	/**
	 * 获取：
	 */
	public String getProxyAddress() {
		return proxyAddress;
	}
	/**
	 * 设置：
	 */
	public void setAdvAddress(String advAddress) {
		this.advAddress = advAddress;
	}
	/**
	 * 获取：
	 */
	public String getAdvAddress() {
		return advAddress;
	}
	/**
	 * 设置：
	 */
	public void setScreen(String screen) {
		this.screen = screen;
	}
	/**
	 * 获取：
	 */
	public String getScreen() {
		return screen;
	}
	/**
	 * 设置：
	 */
	public void setPhoneModel(String phoneModel) {
		this.phoneModel = phoneModel;
	}
	/**
	 * 获取：
	 */
	public String getPhoneModel() {
		return phoneModel;
	}
	/**
	 * 设置：
	 */
	public void setBrowserValue(Integer browserValue) {
		this.browserValue = browserValue;
	}
	/**
	 * 获取：
	 */
	public Integer getBrowserValue() {
		return browserValue;
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
	 * 设置：取证时长（单位秒）
	 */
	public void setDurationSec(Integer durationSec) {
		this.durationSec = durationSec;
	}
	/**
	 * 获取：取证时长（单位秒）
	 */
	public Integer getDurationSec() {
		return durationSec;
	}
}
