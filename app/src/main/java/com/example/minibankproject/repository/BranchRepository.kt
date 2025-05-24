package com.example.minibankproject.repository

import com.example.minibankproject.R
import com.example.minibankproject.data.BranchModel
import com.example.minibankproject.data.BranchType

object BranchRepository {
    val branches = listOf(
        BranchModel(
            id = "1",
            name = "Gulf Bank Headquarters",
            address = "Mubarak Al Kabeer St, Kuwait City",
            type = BranchType.MAIN,
            phone = "+965 2244 4444",
            hours = "8:00 AM - 3:00 PM",
            location = "29.3759, 47.9774",
            imageUri = R.drawable._d667b496be31854fefaf94a740e4fba_jpg__960x0_q85_subsampling_2
        ),   BranchModel(
            id = "2",
            name = "NBK HeadQuarters",
            address = "Alshuhada St, Sharq",
            type = BranchType.MAIN,
            phone = "+965 1801 801",
            hours = "7:00 AM - 3:00 PM",
            location = "29.3332, 48.0766",
            imageUri = R.drawable.norman_foster_partners_national_bank_kuwait_city_designboom_01
        ),
        BranchModel(
            id = "3",
            name = "NBK Salmiya Branch",
            address = "Salem Al Mubarak St, Salmiya",
            type = BranchType.SUB,
            phone = "+965 1801 801",
            hours = "9:00 AM - 1:00 PM",
            location = "29.3332, 48.0766",
            imageUri = R.drawable.eng_pr3498_2021_11_16
        ),
        BranchModel(
            id = "4",
            name = "Burgan Bank ATM - Avenues Mall",
            address = "Avenues Mall, Al-Rai",
            type = BranchType.ATM,
            phone = "+965 2298 8000",
            hours = "24 Hours",
            location = "29.3052, 47.9400",
            imageUri = R.drawable.dbfb46_da79788942904e6fa01e63c89bba727a_mv2
        ),
        BranchModel(
            id = "5",
            name = "KFH Farwaniya Branch",
            address = "Farwaniya Block 3, Kuwait",
            type = BranchType.SUB,
            phone = "+965 1803 333",
            hours = "8:30 AM - 1:30 PM",
            location = "29.2744, 47.9581",
            imageUri = R.drawable.kfh_go_jpg
        ),
        BranchModel(
            id = "6",
            name = "Boubyan Bank Airport Branch",
            address = "AlDhajeej, International airport, Kuwait",
            type = BranchType.SUB,
            phone = "+965 1820 020",
            hours = "24 Hours",
            location = "29.3141, 48.0304",
            imageUri = R.drawable.bbyn_airport_1_jpg__1200x801_q85_subsampling_2
        )
    )
}