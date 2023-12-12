package entities;

import javax.persistence.*;


    @Entity
    @Table (name="evento")
    public class Evento {
        @Id
        @GeneratedValue
        private long id;
        @Column (name ="titolo")
        private String titolo;
        @Column (name ="data_evento")
        private Integer data_evento;
        @Column (name ="descrizione")
        private String descrizione;
        @Column (name ="max_partecipanti")
        private Integer max_partecipanti;
        @Enumerated (EnumType.STRING)
        @Column (name ="tipo_evento")
        private TipoEvento tipo_evento;
        public  Evento() {

        }
        public Evento(String titolo, Integer data_evento, String descrizione, Integer max_partecipanti, TipoEvento tipo_evento ) {
            this.titolo = titolo;
            this.data_evento = data_evento;
            this.descrizione = descrizione;
            this.max_partecipanti = max_partecipanti;
            this.tipo_evento = tipo_evento;
        }

        public String getTitolo() {
            return titolo;
        }

        public void setTitolo(String titolo) {
            this.titolo = titolo;
        }

        public Integer getDataEvento() {
            return data_evento;
        }

        public void setData_evento(Integer data_evento) {
            this.data_evento = data_evento;
        }

        public String getDescrizione() {
            return descrizione;
        }

        public void setDescrizione(String descrizione) {
            this.descrizione = descrizione;
        }

        public Integer getMaxPartecipanti() {
            return max_partecipanti;
        }

        public void setMax_partecipanti(Integer max_partecipanti) {
            this.max_partecipanti = max_partecipanti;
        }

        public TipoEvento getTipoEvento() {
            return tipo_evento;
        }

        public void setTipo_evento(TipoEvento tipo_evento) {
            this.tipo_evento = tipo_evento;
        }


        @Override
        public String toString() {
            return "Evento{" +
                    "id=" + id +
                    ", titolo='" + titolo + '\'' +
                    ", in data='" + data_evento + '\'' +
                    ", descrizione='" + descrizione + '\'' +
                    ", partecipanti massimi='" + max_partecipanti + '\'' +
                    ", tipo evento=" + tipo_evento +
                    '}';
        }



    }
