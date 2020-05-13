/**
 * Livre.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package beans;

public class Livre  implements java.io.Serializable {
    private java.lang.String auteur;

    private java.lang.String categorie;

    private java.lang.String description;

    private int id;

    private java.lang.String image;

    private int nbr;

    private java.lang.String nom;

    private int prix;

    public Livre() {
    }

    public Livre(
           java.lang.String auteur,
           java.lang.String categorie,
           java.lang.String description,
           int id,
           java.lang.String image,
           int nbr,
           java.lang.String nom,
           int prix) {
           this.auteur = auteur;
           this.categorie = categorie;
           this.description = description;
           this.id = id;
           this.image = image;
           this.nbr = nbr;
           this.nom = nom;
           this.prix = prix;
    }


    /**
     * Gets the auteur value for this Livre.
     * 
     * @return auteur
     */
    public java.lang.String getAuteur() {
        return auteur;
    }


    /**
     * Sets the auteur value for this Livre.
     * 
     * @param auteur
     */
    public void setAuteur(java.lang.String auteur) {
        this.auteur = auteur;
    }


    /**
     * Gets the categorie value for this Livre.
     * 
     * @return categorie
     */
    public java.lang.String getCategorie() {
        return categorie;
    }


    /**
     * Sets the categorie value for this Livre.
     * 
     * @param categorie
     */
    public void setCategorie(java.lang.String categorie) {
        this.categorie = categorie;
    }


    /**
     * Gets the description value for this Livre.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Livre.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the id value for this Livre.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Livre.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the image value for this Livre.
     * 
     * @return image
     */
    public java.lang.String getImage() {
        return image;
    }


    /**
     * Sets the image value for this Livre.
     * 
     * @param image
     */
    public void setImage(java.lang.String image) {
        this.image = image;
    }


    /**
     * Gets the nbr value for this Livre.
     * 
     * @return nbr
     */
    public int getNbr() {
        return nbr;
    }


    /**
     * Sets the nbr value for this Livre.
     * 
     * @param nbr
     */
    public void setNbr(int nbr) {
        this.nbr = nbr;
    }


    /**
     * Gets the nom value for this Livre.
     * 
     * @return nom
     */
    public java.lang.String getNom() {
        return nom;
    }


    /**
     * Sets the nom value for this Livre.
     * 
     * @param nom
     */
    public void setNom(java.lang.String nom) {
        this.nom = nom;
    }


    /**
     * Gets the prix value for this Livre.
     * 
     * @return prix
     */
    public int getPrix() {
        return prix;
    }


    /**
     * Sets the prix value for this Livre.
     * 
     * @param prix
     */
    public void setPrix(int prix) {
        this.prix = prix;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Livre)) return false;
        Livre other = (Livre) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.auteur==null && other.getAuteur()==null) || 
             (this.auteur!=null &&
              this.auteur.equals(other.getAuteur()))) &&
            ((this.categorie==null && other.getCategorie()==null) || 
             (this.categorie!=null &&
              this.categorie.equals(other.getCategorie()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this.id == other.getId() &&
            ((this.image==null && other.getImage()==null) || 
             (this.image!=null &&
              this.image.equals(other.getImage()))) &&
            this.nbr == other.getNbr() &&
            ((this.nom==null && other.getNom()==null) || 
             (this.nom!=null &&
              this.nom.equals(other.getNom()))) &&
            this.prix == other.getPrix();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAuteur() != null) {
            _hashCode += getAuteur().hashCode();
        }
        if (getCategorie() != null) {
            _hashCode += getCategorie().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += getId();
        if (getImage() != null) {
            _hashCode += getImage().hashCode();
        }
        _hashCode += getNbr();
        if (getNom() != null) {
            _hashCode += getNom().hashCode();
        }
        _hashCode += getPrix();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Livre.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beans", "Livre"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auteur");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans", "auteur"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categorie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans", "categorie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("image");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans", "image"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nbr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans", "nbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans", "nom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prix");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans", "prix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
