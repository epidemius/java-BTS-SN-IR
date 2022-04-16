class Adresse {
    private String numero;
    private String voie;
    private String ville;
    private String cp;

    public Adresse(String numero, String voie, String ville, String cp) {
        this.numero = numero;
        this.voie = voie;
        this.ville = ville;
        this.setCp(cp);

    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getVoie() {
        return voie;
    }

    public void setVoie(String voie) {
        this.voie = voie;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

}

class Personne {
    private String prenom;
    private String nom;

    public Personne(String prenom, String nom) {
        this.setPrenom(prenom);
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

}

class Deposant extends Personne {
    private String civilite;
    private String mail;
    private String Adresse;

    public Deposant(String nom, String prenom, String civilite, String mail, String Adresse) {
        super(nom, prenom);
        this.civilite = civilite;
        this.setMail(mail);
        this.setAdresse(Adresse);

    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String adresse) {
        this.Adresse = adresse;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCivilite() {
        return civilite;
    }

    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }

}

class Architecte extends Personne {
    private String conseilRegional;
    private String Adresse;
    private String telephone;

    public Architecte(String nom, String prenom, String conseilRegional, String Adresse, String telephone) {
        super(nom, prenom);
        this.conseilRegional = conseilRegional;
        this.Adresse = Adresse;
        this.telephone = telephone;

    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getConseilRegional() {
        return conseilRegional;
    }

    public void setConseilRegional(String conseilRegional) {
        this.conseilRegional = conseilRegional;
    }

}


