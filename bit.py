# Bit Stuffing and De-stuffing Implementation

def perform_bit_stuffing(data_bits):
    stuffed_output = ""
    consecutive_ones = 0

    for bit in data_bits:
        stuffed_output += bit
        if bit == '1':
            consecutive_ones += 1
            if consecutive_ones == 5:
                stuffed_output += '0'
                consecutive_ones = 0
        else:
            consecutive_ones = 0

    return stuffed_output


def perform_bit_destuffing(stuffed_bits):
    destuffed_output = ""
    consecutive_ones = 0
    position = 0

    while position < len(stuffed_bits):
        destuffed_output += stuffed_bits[position]

        if stuffed_bits[position] == '1':
            consecutive_ones += 1
            if consecutive_ones == 5:
                position += 1   # Ignore the stuffed zero
                consecutive_ones = 0
        else:
            consecutive_ones = 0

        position += 1

    return destuffed_output


# Main Execution
bit_stream = input("Enter the bit stream: ")

stuffed_stream = perform_bit_stuffing(bit_stream)
print("Stuffed Bit Stream:", stuffed_stream)

destuffed_stream = perform_bit_destuffing(stuffed_stream)
print("De-stuffed Bit Stream:", destuffed_stream)
