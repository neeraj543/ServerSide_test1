package be.thomasmore.bookserver.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class LibraryDetailedDTO {
    private int id;
    private String location;
    private int members;
    private double membershipFee;
    private double lateFeePerDay;
}

