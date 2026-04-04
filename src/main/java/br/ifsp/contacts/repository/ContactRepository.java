package br.ifsp.contacts.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import br.ifsp.contacts.model.Contact;

/**
 * Esta interface extende JpaRepository, que nos fornece métodos prontos 
 * para acessar e manipular dados no banco de dados. Basta especificar 
 * a classe de entidade (Contact) e o tipo da chave primária (Long).
 */
public interface ContactRepository extends JpaRepository<Contact, Long> {
    // Podemos adicionar métodos personalizados se necessário.

    // metodo que busca pelo nome
    List<Contact> findByNomeContainingIgnoreCase(String nome);
    // comentário extra curso aqui para dizer que isso aqui é simplesmente bruxaria.
}
