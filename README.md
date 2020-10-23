# Basic-Socket-with-TCP-in-Java
1. Tổng quan về Socket:

- Socket được hiểu là cửa giao tiếp giữa tầng ứng dụng và tầng giao vận(Transport Layer). Nói cách khác, Socket là giao diện
do ứng dụng tạo ra trên máy trạm, quản lý bởi hệ điều hành qua đó các ứng dụng có thể gửi/nhận thông điệp đến/từ các ứng dụng 
khác.  Ở đó, Socket sẽ được ràng buộc với một mã số cổng (Port Number) để giúp tầng giao vận định danh được ứng dụng nhận/gửi thông điệp.
- Socket cơ bản có 2 loại:
+ Stream Socket sử dụng TCP(Transmission Control Protocol) truyền dòng bytes.
+ Datagram Socket sử dụng UDP(User Datagram Protocol) truyền gói tin.
- Với ngôn ngữ lập trình Java, cung cấp 3 loại khác nhau của sockets:
+ Stream Socket (TCP) : Tạo luồng dữ liệu hai chiều, đáng tin cậy, có trình tự và không trùng lặp, dữ liệu chỉ được gửi/nhận khi có đã có liên kết. 
Dùng với Socket Class của java.
+ Datagram Socket (UDP): Có thể nhận dữ liệu không theo tình tự, trùng lặp. Dùng với DatagramSocket Class.
+ Multicast Socket : cho phép dữ liệu được gửi đến nhiều bên nhận một lúc. Dùng với DatagramSocket Class.

2. Lập trình TCP Socket với Java:
- Như tính chất của TCP chúng ta cần có liên kết 2 chiều trước khi server và client có thể trao đổi thông điệp với nhau.
- TCP cung cấp dịch vụ truyền dòng tin cậy và có thứ tự giữa client và server, giữa máy chủ và máy nhận chỉ có 1 địa chỉ IP duy nhất. Thêm vào đó, mỗi thông điệp truyền đi đều có xác nhận trả về.
- Miêu tả ứng dụng: 
+ Client đọc dòng văn bản nhập từ bàn phím người dùng, gửi tới server qua Socket.
+ Server đọc dòng văn bản gửi từ Socket.
+ Server sẽ chuyển lại dòng văn bản kèm theo "Server accepted" gửi tới client qua Socket.
+ Client đọc dòng văn bản từ Socket và in ra dòng văn bản nhận được từ server.
