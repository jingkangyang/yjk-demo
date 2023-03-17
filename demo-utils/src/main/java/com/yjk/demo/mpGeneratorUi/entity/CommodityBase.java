package com.yjk.demo.mpGeneratorUi.entity;
import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
/**
 * <p>
 * 基础物料
 * </p>
 *
 * @author yjk
 * @since 2023-03-17
 */
@TableName("spd_commodity_base")
public class CommodityBase implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 物料编码
     */
    @TableField("commodity_code")
    private String commodityCode;

    /**
     * 物料名称
     */
    @TableField("commodity_name")
    private String commodityName;

    /**
     * 物料识别码
     */
    @TableField("commodity_udid")
    private String commodityUdid;

    /**
     * 物料首字母缩写
     */
    @TableField("commodity_initial_letter")
    private String commodityInitialLetter;

    /**
     * 型号
     */
    @TableField("commodity_model")
    private String commodityModel;

    /**
     * 物料规格
     */
    @TableField("commodity_spec")
    private String commoditySpec;

    /**
     * 物料类别（系统字典Id）
     */
    @TableField("commodity_type_id")
    private Long commodityTypeId;

    /**
     * 注册名称
     */
    @TableField("register_name")
    private String registerName;

    /**
     * 注册编码
     */
    @TableField("register_code")
    private String registerCode;

    /**
     * 质保效期
     */
    @TableField("expiration")
    private Integer expiration;

    /**
     * 存储条件（系统字典Id）
     */
    @TableField("storage_condition_id")
    private Long storageConditionId;

    /**
     * 证照类型id（关联spd_certificate_type表id）
     */
    @TableField("certificate_type_id")
    private Long certificateTypeId;

    /**
     * 包装转换系数
     */
    @TableField("package_conversion_coefficient")
    private Integer packageConversionCoefficient;

    /**
     * 包装单位Id
     */
    @TableField("package_unit_id")
    private Long packageUnitId;

    /**
     * 状态 1:待提交；2:待审核；3:已审核；
     */
    @TableField("status")
    private Integer status;

    /**
     * 生产厂家
     */
    @TableField("manufacturer_name")
    private String manufacturerName;

    /**
     * 生产许可证
     */
    @TableField("production_license")
    private String productionLicense;

    /**
     * 物料是否关联证照
     */
    @TableField("is_relate")
    private Integer isRelate;

    /**
     * 推荐赋码 0:否;1:是
     */
    @TableField("is_recommend")
    private Integer isRecommend;

    /**
     * 上游物料编码
     */
    @TableField("pre_commodity_code")
    private String preCommodityCode;

    /**
     * 上游供应商平台编码
     */
    @TableField("pre_supplier_enterprise_code")
    private String preSupplierEnterpriseCode;

    /**
     * 数据来源：1. 手动， 2：HRP，3：ERP，4：HIS
     */
    @TableField("data_source")
    private Integer dataSource;

    @TableField("create_time")
    private Date createTime;

    @TableField("create_user")
    private Long createUser;

    @TableField("update_time")
    private Date updateTime;

    @TableField("update_user")
    private Long updateUser;

    /**
     * 逻辑删除 0.未删除 1.已删除
     */
    @TableField("is_delete")
    private Integer isDelete;

    /**
     * 其他识别码
     */
    @TableField("other_udid")
    private String otherUdid;

    /**
     * 效期预警天数
     */
    @TableField("expiry_alarm_days")
    private Integer expiryAlarmDays;

    /**
     * 收费控制 0：否，1：是
     */
    @TableField("fee_control")
    private Integer feeControl;

    /**
     * 质保效期（年-YEAR，月-MONTH，日-DAY ）
     */
    @TableField("expiration_unit")
    private String expirationUnit;

    /**
     * 是否备货 0:否;1:是
     */
    @TableField("is_need_stock")
    private Integer isNeedStock;

    /**
     * 通用名称
     */
    @TableField("common_name")
    private String commonName;

    /**
     * 产品分组（系统字典Id）
     */
    @TableField("product_group_id")
    private Long productGroupId;

    /**
     * 采购类型（系统字典Id）
     */
    @TableField("purchase_type_id")
    private Long purchaseTypeId;

    /**
     * 是否可复用 0：否，1：是
     */
    @TableField("is_reuse")
    private Integer isReuse;

    /**
     * 复用次数
     */
    @TableField("reuse_times")
    private Integer reuseTimes;

    /**
     * 商品码
     */
    @TableField("merchandise_code")
    private String merchandiseCode;

    /**
     * 是否入柜 0：否，1：是
     */
    @TableField("is_deposit_cabinet")
    private Integer isDepositCabinet;

    /**
     * 医保编码
     */
    @TableField("medical_code")
    private String medicalCode;

    /**
     * 江苏阳彩采购目录Id
     */
    @TableField("jsyc_goods_id")
    private Long jsycGoodsId;

    /**
     * 来源数据Id
     */
    @TableField("source_data_id")
    private String sourceDataId;

    /**
     * 生产厂家编码
     */
    @TableField("manufacturer_code")
    private String manufacturerCode;

    /**
     * 物资分类Id
     */
    @TableField("classify_id")
    private Long classifyId;

    /**
     * 核算类别Id
     */
    @TableField("account_type_id")
    private Long accountTypeId;

    /**
     * 是否冷链材料 0：否，1：是
     */
    @TableField("is_cold_chain")
    private Integer isColdChain;

    /**
     * 是否植入性耗材 0：否，1：是
     */
    @TableField("is_implantable")
    private Integer isImplantable;

    /**
     * 采购平台产品ID
     */
    @TableField("purchase_platform_product_id")
    private String purchasePlatformProductId;

    /**
     * 医用耗材代码
     */
    @TableField("medical_consumables_code")
    private String medicalConsumablesCode;

    /**
     * 带量采购数量要求
     */
    @TableField("purchase_quantity")
    private BigDecimal purchaseQuantity;

    /**
     * 通用名称首母缩写
     */
    @TableField("common_name_initial_letter")
    private String commonNameInitialLetter;

    /**
     * 是否是检验试剂，0 否 1是
     */
    @TableField("is_test_reagent")
    private Integer isTestReagent;

    /**
     * 试剂是否批次管理，0 否 1是
     */
    @TableField("is_batch_reagent")
    private Integer isBatchReagent;

    /**
     * 试剂开瓶-有效天数
     */
    @TableField("reagent_valid_days")
    private Integer reagentValidDays;

    /**
     * 业务状态 0：停用 1：启用
     */
    @TableField("biz_status")
    private Integer bizStatus;

    /**
     * 是否定数 0：否 1：是
     */
    @TableField("fixed_packet")
    private Integer fixedPacket;

    /**
     * 定数包类型 0：单品种 1：多品种
     */
    @TableField("fixed_packet_type")
    private Integer fixedPacketType;

    /**
     * 是否高值 0：否 1：是
     */
    @TableField("is_high_consumable")
    private Integer isHighConsumable;

    /**
     * 医保类别
     */
    @TableField("medical_type_id")
    private String medicalTypeId;

    /**
     * 是否带量采购 0否 1是
     */
    @TableField("is_purchase_quantity")
    private Integer isPurchaseQuantity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCommodityCode() {
        return commodityCode;
    }

    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getCommodityUdid() {
        return commodityUdid;
    }

    public void setCommodityUdid(String commodityUdid) {
        this.commodityUdid = commodityUdid;
    }

    public String getCommodityInitialLetter() {
        return commodityInitialLetter;
    }

    public void setCommodityInitialLetter(String commodityInitialLetter) {
        this.commodityInitialLetter = commodityInitialLetter;
    }

    public String getCommodityModel() {
        return commodityModel;
    }

    public void setCommodityModel(String commodityModel) {
        this.commodityModel = commodityModel;
    }

    public String getCommoditySpec() {
        return commoditySpec;
    }

    public void setCommoditySpec(String commoditySpec) {
        this.commoditySpec = commoditySpec;
    }

    public Long getCommodityTypeId() {
        return commodityTypeId;
    }

    public void setCommodityTypeId(Long commodityTypeId) {
        this.commodityTypeId = commodityTypeId;
    }

    public String getRegisterName() {
        return registerName;
    }

    public void setRegisterName(String registerName) {
        this.registerName = registerName;
    }

    public String getRegisterCode() {
        return registerCode;
    }

    public void setRegisterCode(String registerCode) {
        this.registerCode = registerCode;
    }

    public Integer getExpiration() {
        return expiration;
    }

    public void setExpiration(Integer expiration) {
        this.expiration = expiration;
    }

    public Long getStorageConditionId() {
        return storageConditionId;
    }

    public void setStorageConditionId(Long storageConditionId) {
        this.storageConditionId = storageConditionId;
    }

    public Long getCertificateTypeId() {
        return certificateTypeId;
    }

    public void setCertificateTypeId(Long certificateTypeId) {
        this.certificateTypeId = certificateTypeId;
    }

    public Integer getPackageConversionCoefficient() {
        return packageConversionCoefficient;
    }

    public void setPackageConversionCoefficient(Integer packageConversionCoefficient) {
        this.packageConversionCoefficient = packageConversionCoefficient;
    }

    public Long getPackageUnitId() {
        return packageUnitId;
    }

    public void setPackageUnitId(Long packageUnitId) {
        this.packageUnitId = packageUnitId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getProductionLicense() {
        return productionLicense;
    }

    public void setProductionLicense(String productionLicense) {
        this.productionLicense = productionLicense;
    }

    public Integer getIsRelate() {
        return isRelate;
    }

    public void setIsRelate(Integer isRelate) {
        this.isRelate = isRelate;
    }

    public Integer getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(Integer isRecommend) {
        this.isRecommend = isRecommend;
    }

    public String getPreCommodityCode() {
        return preCommodityCode;
    }

    public void setPreCommodityCode(String preCommodityCode) {
        this.preCommodityCode = preCommodityCode;
    }

    public String getPreSupplierEnterpriseCode() {
        return preSupplierEnterpriseCode;
    }

    public void setPreSupplierEnterpriseCode(String preSupplierEnterpriseCode) {
        this.preSupplierEnterpriseCode = preSupplierEnterpriseCode;
    }

    public Integer getDataSource() {
        return dataSource;
    }

    public void setDataSource(Integer dataSource) {
        this.dataSource = dataSource;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public String getOtherUdid() {
        return otherUdid;
    }

    public void setOtherUdid(String otherUdid) {
        this.otherUdid = otherUdid;
    }

    public Integer getExpiryAlarmDays() {
        return expiryAlarmDays;
    }

    public void setExpiryAlarmDays(Integer expiryAlarmDays) {
        this.expiryAlarmDays = expiryAlarmDays;
    }

    public Integer getFeeControl() {
        return feeControl;
    }

    public void setFeeControl(Integer feeControl) {
        this.feeControl = feeControl;
    }

    public String getExpirationUnit() {
        return expirationUnit;
    }

    public void setExpirationUnit(String expirationUnit) {
        this.expirationUnit = expirationUnit;
    }

    public Integer getIsNeedStock() {
        return isNeedStock;
    }

    public void setIsNeedStock(Integer isNeedStock) {
        this.isNeedStock = isNeedStock;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public Long getProductGroupId() {
        return productGroupId;
    }

    public void setProductGroupId(Long productGroupId) {
        this.productGroupId = productGroupId;
    }

    public Long getPurchaseTypeId() {
        return purchaseTypeId;
    }

    public void setPurchaseTypeId(Long purchaseTypeId) {
        this.purchaseTypeId = purchaseTypeId;
    }

    public Integer getIsReuse() {
        return isReuse;
    }

    public void setIsReuse(Integer isReuse) {
        this.isReuse = isReuse;
    }

    public Integer getReuseTimes() {
        return reuseTimes;
    }

    public void setReuseTimes(Integer reuseTimes) {
        this.reuseTimes = reuseTimes;
    }

    public String getMerchandiseCode() {
        return merchandiseCode;
    }

    public void setMerchandiseCode(String merchandiseCode) {
        this.merchandiseCode = merchandiseCode;
    }

    public Integer getIsDepositCabinet() {
        return isDepositCabinet;
    }

    public void setIsDepositCabinet(Integer isDepositCabinet) {
        this.isDepositCabinet = isDepositCabinet;
    }

    public String getMedicalCode() {
        return medicalCode;
    }

    public void setMedicalCode(String medicalCode) {
        this.medicalCode = medicalCode;
    }

    public Long getJsycGoodsId() {
        return jsycGoodsId;
    }

    public void setJsycGoodsId(Long jsycGoodsId) {
        this.jsycGoodsId = jsycGoodsId;
    }

    public String getSourceDataId() {
        return sourceDataId;
    }

    public void setSourceDataId(String sourceDataId) {
        this.sourceDataId = sourceDataId;
    }

    public String getManufacturerCode() {
        return manufacturerCode;
    }

    public void setManufacturerCode(String manufacturerCode) {
        this.manufacturerCode = manufacturerCode;
    }

    public Long getClassifyId() {
        return classifyId;
    }

    public void setClassifyId(Long classifyId) {
        this.classifyId = classifyId;
    }

    public Long getAccountTypeId() {
        return accountTypeId;
    }

    public void setAccountTypeId(Long accountTypeId) {
        this.accountTypeId = accountTypeId;
    }

    public Integer getIsColdChain() {
        return isColdChain;
    }

    public void setIsColdChain(Integer isColdChain) {
        this.isColdChain = isColdChain;
    }

    public Integer getIsImplantable() {
        return isImplantable;
    }

    public void setIsImplantable(Integer isImplantable) {
        this.isImplantable = isImplantable;
    }

    public String getPurchasePlatformProductId() {
        return purchasePlatformProductId;
    }

    public void setPurchasePlatformProductId(String purchasePlatformProductId) {
        this.purchasePlatformProductId = purchasePlatformProductId;
    }

    public String getMedicalConsumablesCode() {
        return medicalConsumablesCode;
    }

    public void setMedicalConsumablesCode(String medicalConsumablesCode) {
        this.medicalConsumablesCode = medicalConsumablesCode;
    }

    public BigDecimal getPurchaseQuantity() {
        return purchaseQuantity;
    }

    public void setPurchaseQuantity(BigDecimal purchaseQuantity) {
        this.purchaseQuantity = purchaseQuantity;
    }

    public String getCommonNameInitialLetter() {
        return commonNameInitialLetter;
    }

    public void setCommonNameInitialLetter(String commonNameInitialLetter) {
        this.commonNameInitialLetter = commonNameInitialLetter;
    }

    public Integer getIsTestReagent() {
        return isTestReagent;
    }

    public void setIsTestReagent(Integer isTestReagent) {
        this.isTestReagent = isTestReagent;
    }

    public Integer getIsBatchReagent() {
        return isBatchReagent;
    }

    public void setIsBatchReagent(Integer isBatchReagent) {
        this.isBatchReagent = isBatchReagent;
    }

    public Integer getReagentValidDays() {
        return reagentValidDays;
    }

    public void setReagentValidDays(Integer reagentValidDays) {
        this.reagentValidDays = reagentValidDays;
    }

    public Integer getBizStatus() {
        return bizStatus;
    }

    public void setBizStatus(Integer bizStatus) {
        this.bizStatus = bizStatus;
    }

    public Integer getFixedPacket() {
        return fixedPacket;
    }

    public void setFixedPacket(Integer fixedPacket) {
        this.fixedPacket = fixedPacket;
    }

    public Integer getFixedPacketType() {
        return fixedPacketType;
    }

    public void setFixedPacketType(Integer fixedPacketType) {
        this.fixedPacketType = fixedPacketType;
    }

    public Integer getIsHighConsumable() {
        return isHighConsumable;
    }

    public void setIsHighConsumable(Integer isHighConsumable) {
        this.isHighConsumable = isHighConsumable;
    }

    public String getMedicalTypeId() {
        return medicalTypeId;
    }

    public void setMedicalTypeId(String medicalTypeId) {
        this.medicalTypeId = medicalTypeId;
    }

    public Integer getIsPurchaseQuantity() {
        return isPurchaseQuantity;
    }

    public void setIsPurchaseQuantity(Integer isPurchaseQuantity) {
        this.isPurchaseQuantity = isPurchaseQuantity;
    }

    @Override
    public String toString() {
        return "CommodityBase{" +
        ", id=" + id +
        ", commodityCode=" + commodityCode +
        ", commodityName=" + commodityName +
        ", commodityUdid=" + commodityUdid +
        ", commodityInitialLetter=" + commodityInitialLetter +
        ", commodityModel=" + commodityModel +
        ", commoditySpec=" + commoditySpec +
        ", commodityTypeId=" + commodityTypeId +
        ", registerName=" + registerName +
        ", registerCode=" + registerCode +
        ", expiration=" + expiration +
        ", storageConditionId=" + storageConditionId +
        ", certificateTypeId=" + certificateTypeId +
        ", packageConversionCoefficient=" + packageConversionCoefficient +
        ", packageUnitId=" + packageUnitId +
        ", status=" + status +
        ", manufacturerName=" + manufacturerName +
        ", productionLicense=" + productionLicense +
        ", isRelate=" + isRelate +
        ", isRecommend=" + isRecommend +
        ", preCommodityCode=" + preCommodityCode +
        ", preSupplierEnterpriseCode=" + preSupplierEnterpriseCode +
        ", dataSource=" + dataSource +
        ", createTime=" + createTime +
        ", createUser=" + createUser +
        ", updateTime=" + updateTime +
        ", updateUser=" + updateUser +
        ", isDelete=" + isDelete +
        ", otherUdid=" + otherUdid +
        ", expiryAlarmDays=" + expiryAlarmDays +
        ", feeControl=" + feeControl +
        ", expirationUnit=" + expirationUnit +
        ", isNeedStock=" + isNeedStock +
        ", commonName=" + commonName +
        ", productGroupId=" + productGroupId +
        ", purchaseTypeId=" + purchaseTypeId +
        ", isReuse=" + isReuse +
        ", reuseTimes=" + reuseTimes +
        ", merchandiseCode=" + merchandiseCode +
        ", isDepositCabinet=" + isDepositCabinet +
        ", medicalCode=" + medicalCode +
        ", jsycGoodsId=" + jsycGoodsId +
        ", sourceDataId=" + sourceDataId +
        ", manufacturerCode=" + manufacturerCode +
        ", classifyId=" + classifyId +
        ", accountTypeId=" + accountTypeId +
        ", isColdChain=" + isColdChain +
        ", isImplantable=" + isImplantable +
        ", purchasePlatformProductId=" + purchasePlatformProductId +
        ", medicalConsumablesCode=" + medicalConsumablesCode +
        ", purchaseQuantity=" + purchaseQuantity +
        ", commonNameInitialLetter=" + commonNameInitialLetter +
        ", isTestReagent=" + isTestReagent +
        ", isBatchReagent=" + isBatchReagent +
        ", reagentValidDays=" + reagentValidDays +
        ", bizStatus=" + bizStatus +
        ", fixedPacket=" + fixedPacket +
        ", fixedPacketType=" + fixedPacketType +
        ", isHighConsumable=" + isHighConsumable +
        ", medicalTypeId=" + medicalTypeId +
        ", isPurchaseQuantity=" + isPurchaseQuantity +
        "}";
    }
}
