package hello.domain;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class TbLmsBbs {
	@Id
	@GeneratedValue
	long bbsId;
	
	@Column(name="bbsTitle", nullable=false, length=1000)
	String bbsTitle;
	
	@Column(name="sbjtId", nullable=false, length=50)
	String sbjtId;
	
	@Column(name="bbsType", nullable=false, length=10)
	String bbsType;
	
	@Column(name="useYn", nullable=true, length=1)
	char useYn;
	
	@Column(name="bbsDesc", nullable=true, length=4000)
	String bbsDesc;
	
	@Column(name="commentUseYn", nullable=true, length=1)
	char commentUseYn;
	
	@Column(name="openUseYn", nullable=true, length=1)
	char openUseYn;
	
	@Column(name="atchUseYn", nullable=true, length=1)
	char atchUseYn;
	
	@Column(name="recommendUseYn", nullable=true, length=1)
	char recommendUseYn;
	
	@Column(name="delYn", nullable=true, length=1)
	char delYn;
	
	@Column(name="createId", nullable=true, length=15)
	String createId;
	
	@Column(name="createDt", nullable=true)
	@Temporal(TemporalType.TIMESTAMP)
	Date createDt;
	
	@Column(name="updateId", nullable=true, length=15)
	String updateId;
	
	@Column(name="updateDt", nullable=true)
	@Temporal(TemporalType.TIMESTAMP)
	Date updateDt;

	public long getBbsId() {
		return bbsId;
	}

	public void setBbsId(long bbsId) {
		this.bbsId = bbsId;
	}

	public String getBbsTitle() {
		return bbsTitle;
	}

	public void setBbsTitle(String bbsTitle) {
		this.bbsTitle = bbsTitle;
	}

	public String getSbjtId() {
		return sbjtId;
	}

	public void setSbjtId(String sbjtId) {
		this.sbjtId = sbjtId;
	}

	public String getBbsType() {
		return bbsType;
	}

	public void setBbsType(String bbsType) {
		this.bbsType = bbsType;
	}

	public char getUseYn() {
		return useYn;
	}

	public void setUseYn(char useYn) {
		this.useYn = useYn;
	}

	public String getBbsDesc() {
		return bbsDesc;
	}

	public void setBbsDesc(String bbsDesc) {
		this.bbsDesc = bbsDesc;
	}

	public char getCommentUseYn() {
		return commentUseYn;
	}

	public void setCommentUseYn(char commentUseYn) {
		this.commentUseYn = commentUseYn;
	}

	public char getOpenUseYn() {
		return openUseYn;
	}

	public void setOpenUseYn(char openUseYn) {
		this.openUseYn = openUseYn;
	}

	public char getAtchUseYn() {
		return atchUseYn;
	}

	public void setAtchUseYn(char atchUseYn) {
		this.atchUseYn = atchUseYn;
	}

	public char getRecommendUseYn() {
		return recommendUseYn;
	}

	public void setRecommendUseYn(char recommendUseYn) {
		this.recommendUseYn = recommendUseYn;
	}

	public char getDelYn() {
		return delYn;
	}

	public void setDelYn(char delYn) {
		this.delYn = delYn;
	}

	public String getCreateId() {
		return createId;
	}

	public void setCreateId(String createId) {
		this.createId = createId;
	}

	public Date getCreateDt() {
		return createDt;
	}

	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}

	public String getUpdateId() {
		return updateId;
	}

	public void setUpdateId(String updateId) {
		this.updateId = updateId;
	}

	public Date getUpdateDt() {
		return updateDt;
	}

	public void setUpdateDt(Date updateDt) {
		this.updateDt = updateDt;
	}

	@Override
	public String toString() {
		return "tbLmsBbs [bbsId=" + bbsId + ", bbsTitle=" + bbsTitle + ", sbjtId=" + sbjtId + ", bbsType=" + bbsType
				+ ", useYn=" + useYn + ", bbsDesc=" + bbsDesc + ", commentUseYn=" + commentUseYn + ", openUseYn="
				+ openUseYn + ", atchUseYn=" + atchUseYn + ", recommendUseYn=" + recommendUseYn + ", delYn=" + delYn
				+ ", createId=" + createId + ", createDt=" + createDt + ", updateId=" + updateId + ", updateDt="
				+ updateDt + "]";
	}
	
	
}
