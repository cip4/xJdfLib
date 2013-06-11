
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ApprovalParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApprovalParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="MinApprovals" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="ApprovalPersonRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApprovalParams")
public class ApprovalParams
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "MinApprovals")
    protected Integer minApprovals;
    @XmlAttribute(name = "ApprovalPersonRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF approvalPersonRef;

    /**
     * Gets the value of the minApprovals property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinApprovals() {
        return minApprovals;
    }

    /**
     * Sets the value of the minApprovals property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinApprovals(Integer value) {
        this.minApprovals = value;
    }

    /**
     * Gets the value of the approvalPersonRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getApprovalPersonRef() {
        return approvalPersonRef;
    }

    /**
     * Sets the value of the approvalPersonRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalPersonRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.approvalPersonRef = value;
    }

}
