package africa.semicolon.trueCaller.services;

import africa.semicolon.trueCaller.data.models.Contact;
import africa.semicolon.trueCaller.dto.requests.AddContactRequest;
import africa.semicolon.trueCaller.dto.requests.RegisterRequest;
import africa.semicolon.trueCaller.dto.responses.AddContactResponse;
import africa.semicolon.trueCaller.dto.responses.RegisterResponse;

import java.util.List;

public interface iUserService {

    RegisterResponse register(RegisterRequest registerRequest);
    AddContactResponse addContact(AddContactRequest addContactRequest);

    int getNoOfUsers();

    List<Contact> findContactBelongsToUser(String userEmail);
}
