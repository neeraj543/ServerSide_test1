package be.thomasmore.bookserver.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
public class LibraryDTO {
    private int id;
    private String location;
    private int members;
    private double membershipFee;
    private double lateFeePerDay;
}
