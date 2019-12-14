package interfaces;

public interface Identificacao {
    String getCnpj();
    Integer getPeriodo();

    static Identificacao of(final String cnpj, final Integer periodo) {
        return new Identificacao () {
            public String getCnpj() {
                return cnpj;
            }
            public Integer getPeriodo() {
                return periodo;
            }
        };
    }
}



