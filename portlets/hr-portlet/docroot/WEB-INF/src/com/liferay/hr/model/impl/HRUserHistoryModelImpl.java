/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.hr.model.impl;

import com.liferay.hr.model.HRUserHistory;
import com.liferay.hr.model.HRUserHistoryModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

import java.util.Date;

/**
 * The base model implementation for the HRUserHistory service. Represents a row in the &quot;HRUserHistory&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.hr.model.HRUserHistoryModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link HRUserHistoryImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HRUserHistoryImpl
 * @see com.liferay.hr.model.HRUserHistory
 * @see com.liferay.hr.model.HRUserHistoryModel
 * @generated
 */
public class HRUserHistoryModelImpl extends BaseModelImpl<HRUserHistory>
	implements HRUserHistoryModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a h r user history model instance should use the {@link com.liferay.hr.model.HRUserHistory} interface instead.
	 */
	public static final String TABLE_NAME = "HRUserHistory";
	public static final Object[][] TABLE_COLUMNS = {
			{ "hrUserHistoryId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "hrEmploymentTypeId", Types.BIGINT },
			{ "hrJobTitleId", Types.BIGINT },
			{ "hrOfficeId", Types.BIGINT },
			{ "hrTerminationTypeId", Types.BIGINT },
			{ "hrWageTypeId", Types.BIGINT },
			{ "hireDate", Types.TIMESTAMP },
			{ "terminationDate", Types.TIMESTAMP },
			{ "wageAmount", Types.DOUBLE },
			{ "wageCurrencyCode", Types.VARCHAR },
			{ "benefitsExempt", Types.BOOLEAN },
			{ "overtimeExempt", Types.BOOLEAN }
		};
	public static final String TABLE_SQL_CREATE = "create table HRUserHistory (hrUserHistoryId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,hrEmploymentTypeId LONG,hrJobTitleId LONG,hrOfficeId LONG,hrTerminationTypeId LONG,hrWageTypeId LONG,hireDate DATE null,terminationDate DATE null,wageAmount DOUBLE,wageCurrencyCode VARCHAR(75) null,benefitsExempt BOOLEAN,overtimeExempt BOOLEAN)";
	public static final String TABLE_SQL_DROP = "drop table HRUserHistory";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.hr.model.HRUserHistory"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.hr.model.HRUserHistory"),
			true);

	public Class<?> getModelClass() {
		return HRUserHistory.class;
	}

	public String getModelClassName() {
		return HRUserHistory.class.getName();
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.hr.model.HRUserHistory"));

	public HRUserHistoryModelImpl() {
	}

	public long getPrimaryKey() {
		return _hrUserHistoryId;
	}

	public void setPrimaryKey(long pk) {
		setHrUserHistoryId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_hrUserHistoryId);
	}

	public long getHrUserHistoryId() {
		return _hrUserHistoryId;
	}

	public void setHrUserHistoryId(long hrUserHistoryId) {
		_hrUserHistoryId = hrUserHistoryId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public long getHrEmploymentTypeId() {
		return _hrEmploymentTypeId;
	}

	public void setHrEmploymentTypeId(long hrEmploymentTypeId) {
		_hrEmploymentTypeId = hrEmploymentTypeId;
	}

	public long getHrJobTitleId() {
		return _hrJobTitleId;
	}

	public void setHrJobTitleId(long hrJobTitleId) {
		_hrJobTitleId = hrJobTitleId;
	}

	public long getHrOfficeId() {
		return _hrOfficeId;
	}

	public void setHrOfficeId(long hrOfficeId) {
		_hrOfficeId = hrOfficeId;
	}

	public long getHrTerminationTypeId() {
		return _hrTerminationTypeId;
	}

	public void setHrTerminationTypeId(long hrTerminationTypeId) {
		_hrTerminationTypeId = hrTerminationTypeId;
	}

	public long getHrWageTypeId() {
		return _hrWageTypeId;
	}

	public void setHrWageTypeId(long hrWageTypeId) {
		_hrWageTypeId = hrWageTypeId;
	}

	public Date getHireDate() {
		return _hireDate;
	}

	public void setHireDate(Date hireDate) {
		_hireDate = hireDate;
	}

	public Date getTerminationDate() {
		return _terminationDate;
	}

	public void setTerminationDate(Date terminationDate) {
		_terminationDate = terminationDate;
	}

	public double getWageAmount() {
		return _wageAmount;
	}

	public void setWageAmount(double wageAmount) {
		_wageAmount = wageAmount;
	}

	public String getWageCurrencyCode() {
		if (_wageCurrencyCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _wageCurrencyCode;
		}
	}

	public void setWageCurrencyCode(String wageCurrencyCode) {
		_wageCurrencyCode = wageCurrencyCode;
	}

	public boolean getBenefitsExempt() {
		return _benefitsExempt;
	}

	public boolean isBenefitsExempt() {
		return _benefitsExempt;
	}

	public void setBenefitsExempt(boolean benefitsExempt) {
		_benefitsExempt = benefitsExempt;
	}

	public boolean getOvertimeExempt() {
		return _overtimeExempt;
	}

	public boolean isOvertimeExempt() {
		return _overtimeExempt;
	}

	public void setOvertimeExempt(boolean overtimeExempt) {
		_overtimeExempt = overtimeExempt;
	}

	public HRUserHistory toEscapedModel() {
		if (isEscapedModel()) {
			return (HRUserHistory)this;
		}
		else {
			return (HRUserHistory)Proxy.newProxyInstance(HRUserHistory.class.getClassLoader(),
				new Class[] { HRUserHistory.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
					HRUserHistory.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	public Object clone() {
		HRUserHistoryImpl hrUserHistoryImpl = new HRUserHistoryImpl();

		hrUserHistoryImpl.setHrUserHistoryId(getHrUserHistoryId());
		hrUserHistoryImpl.setGroupId(getGroupId());
		hrUserHistoryImpl.setCompanyId(getCompanyId());
		hrUserHistoryImpl.setUserId(getUserId());
		hrUserHistoryImpl.setUserName(getUserName());
		hrUserHistoryImpl.setCreateDate(getCreateDate());
		hrUserHistoryImpl.setHrEmploymentTypeId(getHrEmploymentTypeId());
		hrUserHistoryImpl.setHrJobTitleId(getHrJobTitleId());
		hrUserHistoryImpl.setHrOfficeId(getHrOfficeId());
		hrUserHistoryImpl.setHrTerminationTypeId(getHrTerminationTypeId());
		hrUserHistoryImpl.setHrWageTypeId(getHrWageTypeId());
		hrUserHistoryImpl.setHireDate(getHireDate());
		hrUserHistoryImpl.setTerminationDate(getTerminationDate());
		hrUserHistoryImpl.setWageAmount(getWageAmount());
		hrUserHistoryImpl.setWageCurrencyCode(getWageCurrencyCode());
		hrUserHistoryImpl.setBenefitsExempt(getBenefitsExempt());
		hrUserHistoryImpl.setOvertimeExempt(getOvertimeExempt());

		hrUserHistoryImpl.resetOriginalValues();

		return hrUserHistoryImpl;
	}

	public int compareTo(HRUserHistory hrUserHistory) {
		long pk = hrUserHistory.getPrimaryKey();

		if (getPrimaryKey() < pk) {
			return -1;
		}
		else if (getPrimaryKey() > pk) {
			return 1;
		}
		else {
			return 0;
		}
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		HRUserHistory hrUserHistory = null;

		try {
			hrUserHistory = (HRUserHistory)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = hrUserHistory.getPrimaryKey();

		if (getPrimaryKey() == pk) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (int)getPrimaryKey();
	}

	public void resetOriginalValues() {
	}

	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{hrUserHistoryId=");
		sb.append(getHrUserHistoryId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", hrEmploymentTypeId=");
		sb.append(getHrEmploymentTypeId());
		sb.append(", hrJobTitleId=");
		sb.append(getHrJobTitleId());
		sb.append(", hrOfficeId=");
		sb.append(getHrOfficeId());
		sb.append(", hrTerminationTypeId=");
		sb.append(getHrTerminationTypeId());
		sb.append(", hrWageTypeId=");
		sb.append(getHrWageTypeId());
		sb.append(", hireDate=");
		sb.append(getHireDate());
		sb.append(", terminationDate=");
		sb.append(getTerminationDate());
		sb.append(", wageAmount=");
		sb.append(getWageAmount());
		sb.append(", wageCurrencyCode=");
		sb.append(getWageCurrencyCode());
		sb.append(", benefitsExempt=");
		sb.append(getBenefitsExempt());
		sb.append(", overtimeExempt=");
		sb.append(getOvertimeExempt());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(55);

		sb.append("<model><model-name>");
		sb.append("com.liferay.hr.model.HRUserHistory");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>hrUserHistoryId</column-name><column-value><![CDATA[");
		sb.append(getHrUserHistoryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hrEmploymentTypeId</column-name><column-value><![CDATA[");
		sb.append(getHrEmploymentTypeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hrJobTitleId</column-name><column-value><![CDATA[");
		sb.append(getHrJobTitleId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hrOfficeId</column-name><column-value><![CDATA[");
		sb.append(getHrOfficeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hrTerminationTypeId</column-name><column-value><![CDATA[");
		sb.append(getHrTerminationTypeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hrWageTypeId</column-name><column-value><![CDATA[");
		sb.append(getHrWageTypeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hireDate</column-name><column-value><![CDATA[");
		sb.append(getHireDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>terminationDate</column-name><column-value><![CDATA[");
		sb.append(getTerminationDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>wageAmount</column-name><column-value><![CDATA[");
		sb.append(getWageAmount());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>wageCurrencyCode</column-name><column-value><![CDATA[");
		sb.append(getWageCurrencyCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>benefitsExempt</column-name><column-value><![CDATA[");
		sb.append(getBenefitsExempt());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>overtimeExempt</column-name><column-value><![CDATA[");
		sb.append(getOvertimeExempt());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _hrUserHistoryId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private long _hrEmploymentTypeId;
	private long _hrJobTitleId;
	private long _hrOfficeId;
	private long _hrTerminationTypeId;
	private long _hrWageTypeId;
	private Date _hireDate;
	private Date _terminationDate;
	private double _wageAmount;
	private String _wageCurrencyCode;
	private boolean _benefitsExempt;
	private boolean _overtimeExempt;
	private transient ExpandoBridge _expandoBridge;
}