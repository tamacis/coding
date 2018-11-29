


x = true
y = false

case true do
  ^x -> 
  IO.puts "wont' mathh"
end

cond  do
  y  == false    ->
  IO.puts "This will run"
end

if true do
 IO.puts "This works!"
end

unless nil do
 IO.puts "This will never be seen"
end
