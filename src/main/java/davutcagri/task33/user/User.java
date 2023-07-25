package davutcagri.task33.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_details")
public class User {

    @Id
    private Integer user_id;
    private String username;
    private String first_name;
    private String last_name;
    private String gender;
    private String password;
    private Integer status;

}
