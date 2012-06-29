
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CoverApplicationParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoverApplicationParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Score" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}GlueApplication" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoverApplicationParams", propOrder = {
    "glueApplications",
    "scores"
})
public class CoverApplicationParams
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "GlueApplication")
    protected List<GlueApplication> glueApplications;
    @XmlElement(name = "Score")
    protected List<Score> scores;

    /**
     * Gets the value of the glueApplications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the glueApplications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlueApplications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlueApplication }
     * 
     * 
     */
    public List<GlueApplication> getGlueApplications() {
        if (glueApplications == null) {
            glueApplications = new ArrayList<GlueApplication>();
        }
        return this.glueApplications;
    }

    /**
     * Gets the value of the scores property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scores property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScores().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Score }
     * 
     * 
     */
    public List<Score> getScores() {
        if (scores == null) {
            scores = new ArrayList<Score>();
        }
        return this.scores;
    }

}
